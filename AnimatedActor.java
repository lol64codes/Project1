import mayflower.*;
public class AnimatedActor extends Actor                      
{
    private Animation walk;
    private Timer animationTimer;
    public AnimatedActor()
    {
        animationTimer = new Timer(1);
    }
    public void setAnimation(Animation y)
    {
        walk = y;
    }
    public void act()
    {
        if (animationTimer.isDone())
        {
            animationTimer.reset();
            MayflowerImage m = new MayflowerImage(walk.getNextFrame());
            setImage(m);
        }
    }
}
