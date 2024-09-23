import mayflower.*;
public class TitleScreen extends World
{

    public TitleScreen()
    {
        setBackground("img/BG/BG.png");
    }
    
    public void act()
    {
         if (Mayflower.isKeyDown( Keyboard.KEY_RIGHT ))
         {
           Mayflower.setWorld(new LevelOne() );
         }
    }
}
