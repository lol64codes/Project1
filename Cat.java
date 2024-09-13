import mayflower.*;
public class Cat
{
    private Animation walk;    
    public Cat() 
    {

        String[] catsFrame = new String[10];
        for(int x=0;x<catsFrame.length;x++)
        {                                                                                               
            catsFrame[x]= "img/cat/Walk ("+ (x + 1) + ").png";
        }
        walk=new Animation(50, catsFrame);
        setAnimation(walk);
        walk.scale(100,87);
        walk.setTransparency(50);                                                     
    }
    public void act()
    {
        super.act();
    }
}
