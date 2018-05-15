package GTRedtech.core.loaders.postload;

import GTRedtech.api.enums.GTR_Materials;
import GTRedtech.core.lib.CORE;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


public class GTR_MachineRecipeLoader  {
    public static void run() {

        /*
         Embryonic Growth Chamber Recipes
         */
        CORE.RA.addEmbryonicGrowthChamberRecipe(new ItemStack[]{ItemList.Circuit_Chip_Stemcell.get(1)}, GTR_Materials.GrowthSolutionA.getFluid(1000L), ItemList.Circuit_Chip_Stemcell.get(4), 400, 16);
        CORE.RA.addEmbryonicGrowthChamberRecipe(new ItemStack[]{ItemList.Circuit_Chip_Stemcell.get(2), new ItemStack(Items.bone,5)}, GTR_Materials.GrowthSolutionA.getFluid(2000L),new ItemStack(Items.spawn_egg,1,51) , 400, 32);
        CORE.RA.addEmbryonicGrowthChamberRecipe(new ItemStack[]{ItemList.Circuit_Chip_Stemcell.get(5), GTR_Materials.Netherrack.getDust(32),GTR_Materials.Blaze.getDust(1)}, GTR_Materials.GrowthSolutionA.getFluid(5000L),new ItemStack(Items.spawn_egg,1,61) , 800, 32);

/*
Gregtech Recipes
 */
GT_Values.RA.addChemicalRecipe(Materials.Calcium.getDust(4),null,Materials.Water.getFluid(1000), GTR_Materials.GrowthSolutionA.getFluid(1000),null,32,1000);
    }

}