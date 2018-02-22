package GTRedtech.core.loaders.postload;

import GTRedtech.api.enums.GTR_Materials;
import GTRedtech.core.lib.CORE;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;


public class GTR_MachineRecipeLoader  {
    public static void run() {

        /*
         Embryonic Growth Chamber Recipes
         */
        CORE.RA.addEmbryonicGrowthChamberRecipe(new ItemStack[]{ItemList.Circuit_Chip_Stemcell.get(1)}, GTR_Materials.GrowthSolutionA.getFluid(1000L), ItemList.Circuit_Chip_Stemcell.get(4), 400, 16);


    }

}