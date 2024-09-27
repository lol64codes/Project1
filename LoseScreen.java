import mayflower.*;
public class LoseScreen extends World
{

    public LoseScreen()
    {
        setBackground("img/BG/Lose.png");
    }
    
    public void act()
    {
         if (Mayflower.isKeyDown( Keyboard.KEY_RIGHT ))
         {
           Mayflower.setWorld(new TitleScreen() );
         }
    }
}
