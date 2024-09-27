import mayflower.*;
public class TitleScreen extends World
{
    public TitleScreen()
    {
        setBackground("img/BG/TitleScreen.png");
    }
    
    public void act()
    {
         if (Mayflower.isKeyDown(Keyboard.KEY_RIGHT ))
         {
           Mayflower.setWorld(new LevelOne());
         }
    }
}
