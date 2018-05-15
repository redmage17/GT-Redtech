package GTRedtech.api.util;

import GTRedtech.api.interfaces.internal.IGTR_RecipeAdder;
import gregtech.api.util.GT_Recipe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;


public class GTR_RecipeAdder {

    public static boolean addEmbryonicGrowthChamberRecipe(ItemStack[] aInputs, FluidStack aFluidInput, ItemStack aOutput, int aDuration, int aEUt) {
        if ((aInputs == null) || (aOutput == null)) {
            return false;
        }

        GTR_Recipe.Gregtech_Recipe_Map.sEmbryonicGrowthChamberRecipes.addRecipe(true, aInputs, new ItemStack[]{aOutput}, null, null, new FluidStack[]{aFluidInput}, null, aDuration, aEUt, 0);
        return true;
    }

}

