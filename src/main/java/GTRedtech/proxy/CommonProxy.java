package GTRedtech.proxy;


import GTRedtech.GTRedtech;
import GTRedtech.Gregtech.Wires;
import GTRedtech.core.items.eggs.EggSpawner;
import GTRedtech.core.mobs.MalformedCreeper;
import GTRedtech.core.rendering.entities.RenderMalformedCreeper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

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


        }




        public  void init(FMLInitializationEvent e) {
            Wires.run();

        }

        public void postInit(FMLPostInitializationEvent e) {




        }
    }


