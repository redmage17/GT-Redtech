package GTRedtech.core.texture;



import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;


    public class ResourceManager{

        public static String getOverrideItemTexturePath(){
            return "textures/items/";
        }

        public static String getOverrideBlockTexturePath(){
            return "textures/blocks";
        }

        public static String getOverrideTexturesPath(){
            return "textures";
        }

        public static String GetGuiTexturePath(String textureFileName){
            return String.format("%s/guis/%s", getOverrideTexturesPath(), textureFileName);
        }

        public static String getCustomBlockTexturePath(String textureFileName){
            return String.format("%s/custom/%s", getOverrideBlockTexturePath(), textureFileName);
        }

        public static ResourceLocation getOBJFilePath(String objFileName){
            return new ResourceLocation("GTRedtech", String.format("obj/%s", objFileName));
        }

        public static String GetFXTexturePath(String textureFileName){
            return String.format("%s/items/particles/%s", getOverrideTexturesPath(), textureFileName);
        }

        public static String GetSpellIconTexturePath(String textureFileName){
            return String.format("%s/spell_icons/%s", getOverrideTexturesPath(), textureFileName);
        }

        public static String getMobTexturePath(String textureFileName){
            return String.format("%s/mobs/%s", getOverrideTexturesPath(), textureFileName);
        }

        public static IIcon RegisterTexture(String textureFile, IIconRegister IIconRegister){
            if (!textureFile.contains(":")){
                textureFile = "GTRedtech:" + textureFile;
            }
            if (textureFile.endsWith(".png")){
                textureFile = textureFile.substring(0, textureFile.lastIndexOf(".png"));
            }
            return IIconRegister.registerIcon(textureFile);
        }
    }

