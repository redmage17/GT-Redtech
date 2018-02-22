package GTRedtech.core.loaders.preload;

import GTRedtech.api.enums.GTR_Materials;

import GTRedtech.api.util.Fluid_Utils;
import GTRedtech.proxy.CommonProxy;
import gregtech.GT_Mod;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;


public class GTR_Loader_Item_Block_And_Fluid  {
    public static void run() {
 Fluid_Utils.addFluid("GrowthSolutionA", "Basic Growth Solution", GTR_Materials.GrowthSolutionA, 1, 200, GT_OreDictUnificator.get(OrePrefixes.cell, GTR_Materials.GrowthSolutionA, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
    }
}

