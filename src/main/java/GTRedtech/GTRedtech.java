package GTRedtech;



import GTRedtech.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import gregtech.api.enums.Dyes;
import gregtech.api.enums.MaterialBuilder;
import gregtech.api.enums.Materials;
import gregtech.api.enums.TextureSet;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = "gtredtech", version = "0.1", name = "GT Redtech",dependencies = "required-after:gregtech;")
public class GTRedtech {
    public static final String MODID ="gtredtech" ;
    public static final String MODNAME = "GT Redtech";
    public static final String VERSION = "MC1710";

    @Mod.Instance(value = "gtredtech")
    public static GTRedtech instance;

    @SidedProxy(clientSide = "GTRedtech.proxy.CommonProxy",serverSide = "GTRedtech.proxy.ServerProxy" )
    public static CommonProxy proxy;
    public static Materials AGrowthSolution = new MaterialBuilder(859, TextureSet.SET_FLUID, "Growth Solution A").addCell().addFluid().setRGB(20, 0, 0).setColor(Dyes.dyePink).constructMaterial();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
        }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }

    public static CreativeTabs tabGtredtech = new CreativeTabs("tabGtredtech") {
        @Override
        public Item getTabIconItem(){
                return new ItemStack(Items.rotten_flesh).getItem();
            }

    };

}

