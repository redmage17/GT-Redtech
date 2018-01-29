package GTRedtech.api.util;

import static gregtech.api.enums.GT_Values.*;


import gregtech.api.GregTech_API;
import gregtech.api.objects.GT_ItemStack;
import gregtech.api.util.GT_LanguageManager;
import gregtech.api.util.GT_Recipe;
import net.minecraftforge.fluids.Fluid;

import java.util.*;

import static gregtech.api.enums.GT_Values.E;


public class GTR_Recipe {

public static final Collection<GTR_Recipe> sMappings = new ArrayList<>();
    public static final GTR_Recipe sEmbryonicGrowthChamberRecipes = new GTR_Recipe(new HashSet<GT_Recipe>(200), "gtr.recipe.EmbryonicGrowthChamber", "Embryonic Growth Chamber", (String) null, "gregtech:textures/gui/basicmachines/Assembler", 6, 1, 1, 0, 1, E, 1, E, true, true);

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


    public GTR_Recipe(final Collection<GT_Recipe> aRecipeList,
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

