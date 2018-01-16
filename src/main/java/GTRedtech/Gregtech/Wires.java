package GTRedtech.Gregtech;


import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.metatileentity.implementations.GT_MetaPipeEntity_Cable;
import gregtech.api.util.GT_OreDictUnificator;

public class Wires {
    private static final String aTextWire1 = "wire.";
    private static final String aTextCable1 = "cable.";
    private static final String aTextWire2 = " Wire";
    private static final String aTextCable2 = " Cable";
    private final static boolean aBoolConst_0 = false;
    private static int BaseWireID = 12001;

    public static void run()
    {run1();
    //run2();
    }

    private static void run1() {
        makeWires(Materials.Brass, BaseWireID, 1, 2, 2, 32, true, false);
    }

   /** private static void run2() {
        wireFactory("Brass", 32, 6040, 1, 2, 2);
    }
*/
    private static void wireFactory(String Material, int Voltage, int ID, long insulatedLoss, long uninsulatedLoss, long Amps) {
        final Materials T = Materials.valueOf(Material);
        ;
        int V = 0;
        if (Voltage == 8) {
            V = 0;
        } else if (Voltage == 32) {
            V = 1;
        } else if (Voltage == 128) {
            V = 2;
        } else if (Voltage == 512) {
            V = 3;
        } else if (Voltage == 2048) {
            V = 4;
        } else if (Voltage == 8196) {
            V = 5;
        } else if (Voltage == 32768) {
            V = 6;
        } else if (Voltage == 131072) {
            V = 7;
        } else if (Voltage == 524288) {
            V = 8;
        } else if (Voltage == Integer.MAX_VALUE) {
            V = 9;
        }
    }


    @SuppressWarnings("deprecation")
    private static void  makeWires(final Materials aMaterial, final int aStartID, final long aLossInsulated, final long aLoss, final long aAmperage,final long aVoltage,
        final boolean aInsulatable, final boolean aAutoInsulated)
    {
            GT_OreDictUnificator.registerOre(OrePrefixes.wireGt01, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 0, "wire" + aMaterial.mName.toLowerCase() + ".01", "1x" + aMaterial.mDefaultLocalName + " Wire", 0.125F, aMaterial, aLoss, 1L * aAmperage, aVoltage, aBoolConst_0, !aAutoInsulated).getStackForm(1L));
            GT_OreDictUnificator.registerOre(OrePrefixes.wireGt02, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 1, "wire" + aMaterial.mName.toLowerCase() + ".02", "2x" + aMaterial.mDefaultLocalName + " Wire", 0.25F, aMaterial, aLoss, 2L * aAmperage, aVoltage, aBoolConst_0, !aAutoInsulated).getStackForm(1L));
            GT_OreDictUnificator.registerOre(OrePrefixes.wireGt04, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 2, "wire" + aMaterial.mName.toLowerCase() + ".04", "4x" + aMaterial.mDefaultLocalName + " Wire", 0.375F, aMaterial, aLoss, 4L * aAmperage, aVoltage, aBoolConst_0, !aAutoInsulated).getStackForm(1L));
            GT_OreDictUnificator.registerOre(OrePrefixes.wireGt08, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 3, "wire" + aMaterial.mName.toLowerCase() + ".08", "8x" + aMaterial.mDefaultLocalName + " Wire", 0.5F, aMaterial, aLoss, 8L * aAmperage, aVoltage, aBoolConst_0, !aAutoInsulated).getStackForm(1L));
            GT_OreDictUnificator.registerOre(OrePrefixes.wireGt12, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 4, "wire" + aMaterial.mName.toLowerCase() + ".12", "12x" + aMaterial.mDefaultLocalName + " Wire", 0.625F, aMaterial, aLoss, 12L * aAmperage, aVoltage, aBoolConst_0, !aAutoInsulated).getStackForm(1L));
            GT_OreDictUnificator.registerOre(OrePrefixes.wireGt16, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 5, "wire" + aMaterial.mName.toLowerCase() + ".16", "16x" + aMaterial.mDefaultLocalName + " Wire", 0.75F, aMaterial, aLoss, 16L * aAmperage, aVoltage, aBoolConst_0, !aAutoInsulated).getStackForm(1L));
            if (aInsulatable) {
                GT_OreDictUnificator.registerOre(OrePrefixes.cableGt01, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 6, "cable" + aMaterial.mName.toLowerCase() + ".01", "1x" + aMaterial.mDefaultLocalName + " Cable", 0.25F, aMaterial, aLossInsulated, 1L * aAmperage, aVoltage, true, aBoolConst_0).getStackForm(1L));
                GT_OreDictUnificator.registerOre(OrePrefixes.cableGt02, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 7, "cable" + aMaterial.mName.toLowerCase() + ".02", "2x" + aMaterial.mDefaultLocalName + " Cable" , 0.375F, aMaterial, aLossInsulated, 2L * aAmperage, aVoltage, true, aBoolConst_0).getStackForm(1L));
                GT_OreDictUnificator.registerOre(OrePrefixes.cableGt04, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 8, "cable" + aMaterial.mName.toLowerCase() + ".04", "4x" + aMaterial.mDefaultLocalName + " Cable", 0.5F, aMaterial, aLossInsulated, 4L * aAmperage, aVoltage, true, aBoolConst_0).getStackForm(1L));
                GT_OreDictUnificator.registerOre(OrePrefixes.cableGt08, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 9, "cable" + aMaterial.mName.toLowerCase() + ".08", "8x" + aMaterial.mDefaultLocalName + " Cable", 0.625F, aMaterial, aLossInsulated, 8L * aAmperage, aVoltage, true, aBoolConst_0).getStackForm(1L));
                GT_OreDictUnificator.registerOre(OrePrefixes.cableGt12, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 10, "cable" + aMaterial.mName.toLowerCase() + ".12", "12x" + aMaterial.mDefaultLocalName + " Cable", 0.75F, aMaterial, aLossInsulated, 12L * aAmperage, aVoltage, true, aBoolConst_0).getStackForm(1L));
            }
        }

    }
