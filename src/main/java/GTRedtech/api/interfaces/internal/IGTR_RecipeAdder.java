package GTRedtech.api.interfaces.internal;

import gregtech.api.enums.ItemList;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public interface IGTR_RecipeAdder {
    /**
     * Adds a Embryonic Growth Chamber Recipe
     *
     * @param aInputs   must be 1-6 ItemStacks
     * @param aFluidInput 0-1 fluids
     * @param aOutput  must be != null
     * @param aDuration must be > 0
     * @param aEUt      should be > 0
     */
    public  boolean addEmbryonicGrowthChamberRecipe(ItemStack[] aInputs, FluidStack aFluidInput, ItemStack aOutput, int aDuration, int aEUt);

}