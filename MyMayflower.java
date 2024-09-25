import mayflower.*;
public class MyMayflower extends Mayflower
{
    public MyMayflower()
    {
        super("Project 1", 800, 600);
    }
    public void init()
    {
        Mayflower.setFullScreen(false);
        World w =  new TitleScreen();
        Mayflower.setWorld(w);
    }
}
