package GTRedtech.core.loaders.preload;


import GTRedtech.api.enums.ItemList;
import gregtech.api.metatileentity.implementations.GT_MetaTileEntity_BasicMachine_GT_Recipe;
import gregtech.api.util.GT_Recipe;


public class GTR_Loader_MetaTileEntities  {
    private static final String aTextWire1 = "wire."; private static final String aTextCable1 = "cable."; private static final String aTextWire2 = " Wire"; private static final String aTextCable2 = " Cable";
    private final static String aTextPlate = "PPP"; private final static String aTextPlateWrench = "PwP"; private final static String aTextPlateMotor = "PMP"; private final static String aTextCableHull = "CMC";
    private final static String aTextWireHull = "WMW"; private final static String aTextWireChest = "WTW"; private final static String aTextWireCoil = "WCW"; private final static String aTextMotorWire = "EWE";
    private final static String aTextWirePump = "WPW";
    private final static boolean aBoolConst_0 = false;

    public static void run(){
        ItemList.Embryonic_Growth_Chamber_LV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(12400, "basicmachine.embryonicgrowth.tier.01", "Basic Embryonic Growth Chamber", 1, "Time to Play God!", GT_Recipe.GT_Recipe_Map.sAssemblerRecipes, 6, 2, 16000, 0, 1, "Assembler.png", "", aBoolConst_0, aBoolConst_0, 0, "ASSEMBLER", new Object[]{"ACA", "VMV", aTextWireCoil, 'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 'V', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CONVEYOR, 'A', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.ROBOT_ARM, 'C', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CIRCUIT, 'W', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.WIRE}).getStackForm(1L));
    };
}
