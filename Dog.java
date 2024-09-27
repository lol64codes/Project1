import mayflower.*;
public class Dog extends AnimatedActor
{
    private Animation walk;    
    public Dog()
    {
        String[] dogsFrame = new String[10];
        for(int x=0;x<dogsFrame.length;x++)
        {                                                                                               
            dogsFrame[x]= "img/dog/Walk ("+ (x + 1) + ").png";  
        }
        walk=new Animation(50, dogsFrame);
        setAnimation(walk);
        walk.scale(100,87); 
        
    }
    public void act()
    {
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        if (Mayflower.isKeyDown(Keyboard.KEY_D) && (x <= 800 - w))
        {
            setLocation (x + 2, y);
        }
        if (Mayflower.isKeyDown(Keyboard.KEY_A) && (x >= 0))
        {
            setLocation (x - 2, y);
        }
        if (Mayflower.isKeyDown(Keyboard.KEY_W) && (y > 0))
        {
            setLocation(x, y - 2);
        }
        else if (y <= 510 - h)
        {
            if (Mayflower.isKeyDown(Keyboard.KEY_D) && (x <= 800 - w)) 
            {
                setLocation (x + 2, y + 1);
            }
            else if (Mayflower.isKeyDown(Keyboard.KEY_A) && (x >= 0)) 
            {
                setLocation (x - 2, y + 1);
            }
            else 
            {
                setLocation (x, y + 1);
            }
        }
        if (isTouching(Cat.class))
        {
            Object a = getOneIntersectingObject(Cat.class);
            Cat c = (Cat) a;
            World m = getWorld(); 
            c.decreaseLives( 1 );
        
            if(c.getLives()>0)
            {
                c.setLocation(400,300);
            }
            else
            {
                m.removeObject(c);
            }
        }
      
    }
}
