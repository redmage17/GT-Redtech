package GTRedtech.api.util;

import GTRedtech.api.interfaces.internal.IGTR_RecipeAdder;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;


public class GTR_RecipeAdder implements IGTR_RecipeAdder {
   @Override
    public boolean addEmbryonicGrowthChamberRecipe(final ItemStack aInput1, final ItemStack aInput2, final ItemStack aInput3, final ItemStack aInput4, final ItemStack aInput5, final ItemStack aInput6, final FluidStack aFluidInput, final FluidStack aFluidOutput, final ItemStack aOutput1, final ItemStack aOutput2, int aDuration, final int aEUt){
       return GTR_Recipe.sEmbryonicGrowthChamberRecipes.addRecipe();
   }


}
