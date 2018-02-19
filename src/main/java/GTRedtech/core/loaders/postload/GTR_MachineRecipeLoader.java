package GTRedtech.core.loaders.postload;



import GTRedtech.GTRedtech;


import GTRedtech.api.enums.GTR_Materials;
import GTRedtech.core.lib.CORE;
import gregtech.api.enums.ItemList;
import net.minecraft.item.ItemStack;


public class GTR_MachineRecipeLoader  {
    public static void run() {

        CORE.RA.addEmbryonicGrowthChamberRecipe(new ItemStack[]{ItemList.Circuit_Chip_Stemcell.get(1)}, GTR_Materials.GrowthSolutionA.getFluid(1000L), ItemList.Circuit_Chip_Stemcell.get(1), 400, 16);

    }
}