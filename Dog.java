import mayflower.*;
public class Dog extends AnimatedActor
{
    private Animation walk;    
    public Dog()
    {
        String[] dogsFrame = new String[10];
        for(int x = 0; x < dogsFrame.length; x++)
        {                                                                                               
            dogsFrame[x] = "img/dog/Walk ("+ (x + 1) + ").png";  
        }
        walk = new Animation(50, dogsFrame);
        setAnimation(walk);
        walk.scale(0.3);
    }
    public void act()
    {
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        if (Mayflower.isKeyDown(Keyboard.KEY_D))
        {
            if (x <= 800 - w)
            {
                setLocation (x + 3, y);
            }
            else
            {
                setLocation (0, y);
            }
        }
        if (Mayflower.isKeyDown(Keyboard.KEY_A))
        {
            if (x >= 0)
            {
                setLocation (x - 3, y);
            }
            else
            {
                setLocation (700, y);
            }
        }
        if (Mayflower.isKeyDown(Keyboard.KEY_W) && (y > 0))
        {
            setLocation(x, y - 3);
        }
        else if (y <= 510 - h)
        {
            if (Mayflower.isKeyDown(Keyboard.KEY_D) && (x <= 800 - w)) 
            {
                setLocation (x + 1, y + 1);
            }
            else if (Mayflower.isKeyDown(Keyboard.KEY_A) && (x >= 0)) 
            {
                setLocation (x - 1, y + 1);
            }
            else {
                setLocation (x, y + 1);
            }
        }
        super.act();
        if (isTouching(Cat.class))
        {
            Object a = getOneIntersectingObject(Cat.class);
            Cat c = (Cat) a;
            World m = getWorld(); 
            c.decreaseLives( 1 );
        
            if(c.getLives()>0)
            {
                c.setLocation(500,200);
            }
            else
            {
                m.removeObject(c);
            }
        }
      
    }
}
