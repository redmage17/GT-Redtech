package GTRedtech.api.enums;

import gregtech.api.enums.Dyes;
import gregtech.api.enums.MaterialBuilder;
import gregtech.api.enums.Materials;
import gregtech.api.enums.TextureSet;

public class GTR_Materials extends Materials {
    public GTR_Materials(int aMetaItemSubID, TextureSet aIconSet, float aToolSpeed, int aDurability, int aToolQuality, int aTypes, int aR, int aG, int aB, int aA, String aName, String aDefaultLocalName, int aFuelType, int aFuelPower, int aMeltingPoint, int aBlastFurnaceTemp, boolean aBlastFurnaceRequired, boolean aTransparent, int aOreValue, int aDensityMultiplier, int aDensityDivider, Dyes aColor) {
        super(aMetaItemSubID, aIconSet, aToolSpeed, aDurability, aToolQuality, aTypes, aR, aG, aB, aA, aName, aDefaultLocalName, aFuelType, aFuelPower, aMeltingPoint, aBlastFurnaceTemp, aBlastFurnaceRequired, aTransparent, aOreValue, aDensityMultiplier, aDensityDivider, aColor);
    }
    //public static Materials GrowthSolutionA = new Materials ( 12300, TextureSet.SET_FLUID, 1.0F, 0, 2, 16, 100, 275, 0, 0, "GrowthSolutionA", "Basic Growth Solution", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeLime);
public static MaterialBuilder GrowthSolutionA = (new MaterialBuilder(12300,TextureSet.SET_FLUID,"Growth Solution A")).addFluid().setRGB(100, 0, 0).setColor(Dyes.dyePink);
}


