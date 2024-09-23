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
        super.act();        
      
    }
}
