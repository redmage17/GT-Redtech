package GTRedtech.core.rendering.entities;

import GTRedtech.core.mobs.MalformedCreeper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.util.ResourceLocation;


public class RenderMalformedCreeper extends RenderCreeper {
    private static final ResourceLocation malformedCreeperTexture = new ResourceLocation("gtredtech:textures/mobs/malformed_creeper.png");


    public void doRender(EntityCreeper entityCreeper, double x, double y, double z, float rotationYaw, float rotationPitch)

    {
        super.doRender((EntityCreeper) entityCreeper, x, y, z, rotationYaw, rotationPitch);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityCreeper entity) {
        return malformedCreeperTexture;
    }

}