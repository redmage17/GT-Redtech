package GTRedtech.api.util;

import static gregtech.api.enums.GT_Values.*;


import gregtech.api.GregTech_API;
import gregtech.api.objects.GT_ItemStack;
import gregtech.api.util.GT_LanguageManager;
import gregtech.api.util.GT_Recipe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

import java.util.*;




public class GTR_Recipe extends GT_Recipe {
    public GTR_Recipe(final boolean aOptimize, final ItemStack[] aInputs, final ItemStack[] aOutputs, final Object aSpecialItems, final int[] aChances, final FluidStack[] aFluidInputs, final FluidStack[] aFluidOutputs, final int aDuration, final int aEUt, final int aSpecialValue) {
        super(aOptimize, aInputs, aOutputs, aSpecialItems, aChances, aFluidInputs, aFluidOutputs, aDuration, aEUt, aSpecialValue);
    }

    public GTR_Recipe(final ItemStack aInput1, final ItemStack aInput2, final ItemStack aInput3, final ItemStack aInput4, final ItemStack aInput5, final ItemStack aInput6, final ItemStack aOutput1, final ItemStack aOutput2, final FluidStack aFluidInput1, final FluidStack aFluidOutput1, final int aSpecialValue) {
        this(true, new ItemStack[]{aInput1, aInput2, aInput3, aInput4, aInput5, aInput6}, new ItemStack[]{aOutput1, aOutput2}, null, null, new FluidStack[]{aFluidInput1}, new FluidStack[]{aFluidOutput1}, 0, 0, Math.max(1, aSpecialValue));
    return GT_Recipe_Map.sEmbryonicGrowthChamberRecipes.
    }

        public static class Gregtech_Recipe_Map {
            public final Collection<Gregtech_Recipe_Map> sMappings = new ArrayList();
            public final GT_Recipe_Map sEmbryonicGrowthChamberRecipes = new GT_Recipe_Map(new HashSet<GT_Recipe>(200), "gtr.recipe.EmbryonicGrowthChamber", "Embryonic Growth Chamber", "Embryonic Growth Chamber", "gregtech:textures/gui/basicmachines/Assembler", 6, 1, 1, 0, 1, E, 1, E, true, true);

            /**
             * HashMap of Recipes based on their Items
             */
            public final Map<GT_ItemStack, Collection<GT_Recipe>> mRecipeItemMap = new HashMap<>();
            /**
             * HashMap of Recipes based on their Fluids
             */
            public final Map<Fluid, Collection<GT_Recipe>> mRecipeFluidMap = new HashMap<>();
            /**
             * The List of all Recipes
             */
            public final Collection<GT_Recipe> mRecipeList;
            /**
             * String used as an unlocalised Name.
             */
            public final String mUnlocalizedName;
            /**
             * String used in NEI for the Recipe Lists. If null it will use the unlocalised Name instead
             */
            public final String mNEIName;
            /**
             * GUI used for NEI Display. Usually the GUI of the Machine itself
             */
            public final String mNEIGUIPath;
            public final String mNEISpecialValuePre, mNEISpecialValuePost;
            public final int mUsualInputCount, mUsualOutputCount, mNEISpecialValueMultiplier, mMinimalInputItems, mMinimalInputFluids, mAmperage;
            public final boolean mNEIAllowed, mShowVoltageAmperageInNEI;


            public Gregtech_Recipe_Map(final Collection<GT_Recipe> aRecipeList,
                                       final String aUnlocalizedName, final String aLocalName, final String aNEIName,
                                       final String aNEIGUIPath, final int aUsualInputCount,
                                       final int aUsualOutputCount, final int aMinimalInputItems,
                                       final int aMinimalInputFluids, final int aAmperage,
                                       final String aNEISpecialValuePre, final int aNEISpecialValueMultiplier,
                                       final String aNEISpecialValuePost, final boolean aShowVoltageAmperageInNEI,
                                       final boolean aNEIAllowed) {
                sMappings.add(this);
                this.mNEIAllowed = aNEIAllowed;
                this.mShowVoltageAmperageInNEI = aShowVoltageAmperageInNEI;
                this.mRecipeList = aRecipeList;
                this.mNEIName = aNEIName == null ? aUnlocalizedName : aNEIName;
                this.mNEIGUIPath = aNEIGUIPath.endsWith(".png") ? aNEIGUIPath : aNEIGUIPath + ".png";
                this.mNEISpecialValuePre = aNEISpecialValuePre;
                this.mNEISpecialValueMultiplier = aNEISpecialValueMultiplier;
                this.mNEISpecialValuePost = aNEISpecialValuePost;
                this.mAmperage = aAmperage;
                this.mUsualInputCount = aUsualInputCount;
                this.mUsualOutputCount = aUsualOutputCount;
                this.mMinimalInputItems = aMinimalInputItems;
                this.mMinimalInputFluids = aMinimalInputFluids;
                GregTech_API.sFluidMappings.add(this.mRecipeFluidMap);
                GregTech_API.sItemStackMappings.add(this.mRecipeItemMap);
                GT_LanguageManager.addStringLocalization(this.mUnlocalizedName = aUnlocalizedName, aLocalName);
            }
        }
    }


