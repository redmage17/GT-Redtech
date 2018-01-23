package GTRedtech.api.util;

import gregtech.api.GregTech_API;
import gregtech.api.enums.ItemList;
import gregtech.api.interfaces.tileentity.IHasWorldObjectAndCoords;
import gregtech.api.util.GT_Recipe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import java.util.Collection;
import java.util.HashSet;

public class GTR_Recipe {
    public static class GT_Recipe_Map_EmbryonicGrowthChamber extends GT_Recipe.GT_Recipe_Map {
        public GT_Recipe_Map_EmbryonicGrowthChamber(Collection<GT_Recipe> aRecipeList, String aUnlocalizedName, String aLocalName, String aNEIName, String aNEIGUIPath, int aUsualInputCount, int aUsualOutputCount, int aMinimalInputItems, int aMinimalInputFluids, int aAmperage, String aNEISpecialValuePre, int aNEISpecialValueMultiplier, String aNEISpecialValuePost, boolean aShowVoltageAmperageInNEI, boolean aNEIAllowed) {
            super(aRecipeList, aUnlocalizedName, aLocalName, aNEIName, aNEIGUIPath, aUsualInputCount, aUsualOutputCount, aMinimalInputItems, aMinimalInputFluids, aAmperage, aNEISpecialValuePre, aNEISpecialValueMultiplier, aNEISpecialValuePost, aShowVoltageAmperageInNEI, aNEIAllowed);
        }

        public GT_Recipe findRecipe(IHasWorldObjectAndCoords aTileEntity, GT_Recipe aRecipe, boolean aNotUnificated, long aVoltage, FluidStack[] aFluids, ItemStack aSpecialSlot, ItemStack... aInputs) {
            GT_Recipe rRecipe = super.findRecipe(aTileEntity, aRecipe, aNotUnificated, aVoltage, aFluids, aSpecialSlot, aInputs);
            if (aInputs != null && aInputs.length > 0 && aInputs[0] != null && rRecipe != null && GregTech_API.sPostloadFinished) {
                ItemStack[] var10 = aInputs;
                int var11 = aInputs.length;

                for (int var12 = 0; var12 < var11; ++var12) {
                    ItemStack aInput = var10[var12];
                    if (ItemList.Paper_Printed_Pages.isStackEqual(aInput, false, true)) {
                        rRecipe = rRecipe.copy();
                        rRecipe.mCanBeBuffered = false;
                        rRecipe.mOutputs[0].setTagCompound(aInput.getTagCompound());
                    }
                }

                return rRecipe;
            } else {
                return rRecipe;
            }
        }
    }
    public static final GT_Recipe.GT_Recipe_Map sEmbryonicGrowthChamberRecipes = new GT_Recipe.GT_Recipe_Map_Assembler(new HashSet(300), "gt.recipe.assembler", "Embronic Growth Chamber", (String)null, "gregtech:textures/gui/basicmachines/Assembler", 6, 1, 1, 0, 1, "", 1, "", true, true);
}
