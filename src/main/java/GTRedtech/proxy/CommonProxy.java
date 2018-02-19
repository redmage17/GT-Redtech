package GTRedtech.proxy;


import GTRedtech.GTRedtech;
import GTRedtech.Gregtech.Wires;
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

    public Fluid addAutoGeneratedCorrespondingFluid(Materials aMaterial){
        return addFluid(aMaterial.mName.toLowerCase(Locale.ENGLISH), "molten.autogenerated", aMaterial.mDefaultLocalName, aMaterial,
                aMaterial.mRGBa, 1, aMaterial.getLiquidTemperature(), GT_OreDictUnificator.get(OrePrefixes.cell, aMaterial, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
    }


    public  Fluid addFluid(String s, String aName, String aLocalized, Materials aMaterial, short[] mRGBa, int i, int aState, ItemStack stack, ItemStack itemStack, int aTemperatureK) {
        return addFluid(aName, aLocalized, aMaterial, aState, aTemperatureK, null, null, 0);
    }

    public  Fluid addFluid(String aName, String aLocalized, Materials aMaterial, int aState, int aTemperatureK, ItemStack aFullContainer,
                                 ItemStack aEmptyContainer, int aFluidAmount) {
        return addFluid(aName, aName.toLowerCase(Locale.ENGLISH), aLocalized, aMaterial, null, aState, aTemperatureK, aFullContainer, aEmptyContainer, aFluidAmount);
    }

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


