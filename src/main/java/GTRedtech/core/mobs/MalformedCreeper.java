package GTRedtech.core.mobs;


import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class MalformedCreeper extends EntityCreeper {

    private int lastActiveTime;
    private int timeSinceIgnited;
    private int fuseTime = 30;
    private int explosionRaduis = 0;

    public MalformedCreeper(World world) {
        super(world);
        setSize(1,2);
        preventEntitySpawning = true;
        this.getNavigator().setAvoidsWater(true);
        this.getNavigator().setBreakDoors(false);
        this.getNavigator().setCanSwim(false);
        this.getNavigator().setAvoidSun(false);
        this.tasks.addTask(0,new EntityAIWander(this,0.10));
        this.tasks.addTask(1,new EntityAIPanic(this,.25));
    }

    public MalformedCreeper(World world, double x, double y, double z) {
            this(world);
            setPosition(x,y,z);
        }


        public void onUpdate()
    {
        if (this.isEntityAlive())
        {
            this.lastActiveTime = this.timeSinceIgnited;
            int var1 = this.getCreeperState();

            if (var1 > 0 && this.timeSinceIgnited == 0)
            {
                this.playSound("random.fuse", 1.0F, 0.5F);
            }

            this.timeSinceIgnited += var1;

            if (this.timeSinceIgnited < 0)
            {
                this.timeSinceIgnited = 0;
            }

            if (this.timeSinceIgnited >= this.fuseTime)
            {
                this.timeSinceIgnited = this.fuseTime;

                if (!this.worldObj.isRemote)
                {
                    this.setDead();
                }
            }
        }

        super.onUpdate();
    }

        public boolean isAIEnabled(){
        return true;
        }
@Override
    protected Item getDropItem() {return Items.rotten_flesh;}

    public EntityAgeable createChild(EntityAgeable entity) {
        return null;
    }
}

