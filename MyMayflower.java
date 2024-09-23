import mayflower.*;

public class MyMayflower extends Mayflower 
{

    public MyMayflower()
    {
        //Create a window with 800x600 resolution
        super("Lab 5", 800, 600);
    }

    public void init()
    {
        //Change this to true to run this program in fullscreen mode
        Mayflower.setFullScreen(false);
        World w =  new TitleScreen();
        Mayflower.setWorld(w);
    }
}
