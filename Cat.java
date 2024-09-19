import mayflower.*;
public class Cat extends AnimatedActor
{
    private Animation walk;    
    public Cat() 
    {
        String[] catsFrame = new String[10];
        for (int x = 0; x < catsFrame.length; x++)
        {                                                                                               
            catsFrame[x]= "img/cat/Walk (" + (x + 1) + ").png";
        }
        walk = new Animation(50, catsFrame);
        setAnimation(walk);
        walk.scale(100, 87);
        walk.setTransparency(50);                                                     
    }
    public void act()
    {
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        if (Mayflower.isKeyDown(Keyboard.KEY_RIGHT) && (x <= 800 - w)) 
        {
            setLocation (x + 1, y);
        }
        if (Mayflower.isKeyDown(Keyboard.KEY_LEFT) && (x >= 0)) 
        {
            setLocation (x - 1, y);
        }
        if (Mayflower.isKeyDown(Keyboard.KEY_UP) && (y > 0))
        {
            setLocation(x, y - 2);
        }
        if (Mayflower.isKeyDown(Keyboard.KEY_DOWN) && (y <= 510 - h))
        {
            setLocation(x, y + 2);
        }
    }
}
