package GTRedtech.proxy;


import GTRedtech.GTRedtech;
import GTRedtech.core.items.eggs.EggSpawner;
import GTRedtech.core.loaders.postload.GTR_MachineRecipeLoader;
import GTRedtech.core.loaders.preload.GTR_Loader_Item_Block_And_Fluid;
import GTRedtech.core.loaders.preload.GTR_Loader_MetaTileEntities;
import GTRedtech.core.mobs.MalformedCreeper;
import GTRedtech.core.rendering.entities.RenderMalformedCreeper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;

import java.util.Locale;

public class CommonProxy {


        int ModEntitiyID;



        public void preInit(FMLPreInitializationEvent e) {
            //Materials

            //Mobs

            ModEntitiyID = EntityRegistry.findGlobalUniqueEntityId();
            EntityRegistry.registerModEntity(MalformedCreeper.class,"MalformedCreeper",ModEntitiyID++, GTRedtech.instance,80,1,false);

            //Eggs

            Item itemSpawnEgg = new EggSpawner("MalformedCreeper", 0xFF7396, 0xa30628)
                    .setUnlocalizedName("spawn_egg_"+"Malformed Creeper".toLowerCase())
                    .setTextureName("gtredtech:spawn_egg");
            GameRegistry.registerItem(itemSpawnEgg, "spawnEggMalformedCreeper","gtredtech");


            RenderingRegistry.registerEntityRenderingHandler(MalformedCreeper.class, new RenderMalformedCreeper());
            GTR_Loader_Item_Block_And_Fluid.run();
            GTR_Loader_MetaTileEntities.run();

        }



@Deprecated
        public  void init(FMLInitializationEvent e) {

        }

        public void postInit(FMLPostInitializationEvent e) {

            GTR_MachineRecipeLoader.run();


        }
    }


