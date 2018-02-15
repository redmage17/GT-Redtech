package GTRedtech.core.loaders.postload;



import GTRedtech.api.util.GTR_RecipeAdder;

import GTRedtech.core.lib.CORE;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;

import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.item.ItemStack;


public class GTR_MachineRecipeLoader  {
    public static   void run() {

        Object o = new Object[0];
        CORE.RA.addEmbryonicGrowthChamberRecipe(new ItemStack[]{ItemList.Circuit_Chip_Stemcell.get(1,o)},Materials.Water.getFluid(1000L), ItemList.Circuit_Chip_Stemcell.get(1,o), 400, 16);
        }
}