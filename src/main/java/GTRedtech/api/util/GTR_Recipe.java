package GTRedtech.api.util;

import static gregtech.api.enums.GT_Values.*;
import gregtech.api.util.GT_Recipe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import java.util.*;




public  class GTR_Recipe extends GT_Recipe {
    public GTR_Recipe(final boolean aOptimize, final ItemStack[] aInputs, final ItemStack[] aOutputs, final Object aSpecialItems, final int[] aChances, final FluidStack[] aFluidInputs, final FluidStack[] aFluidOutputs, final int aDuration, final int aEUt, final int aSpecialValue) {
        super(aOptimize, aInputs, aOutputs, aSpecialItems, aChances, aFluidInputs, aFluidOutputs, aDuration, aEUt, aSpecialValue);
    }
public static class Gregtech_Recipe_Map {
        public static final Collection <Gregtech_Recipe_Map> sMappings = new ArrayList<>();
    public static final GT_Recipe_Map sEmbryonicGrowthChamberRecipes = new GT_Recipe_Map(new HashSet<GT_Recipe>(300), "gtr.recipe.embryonicgrowthchamber", "Embryonic Growth Chamber", null, RES_PATH_GUI + "basicmachines/CircuitAssembler", 6, 1, 1, 0, 1, E, 1, E, true, true);


}




}

