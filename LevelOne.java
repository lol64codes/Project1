import mayflower.*;
public class LevelOne extends TitleScreen 
{
    private Cat cat;
    private Dog dog;
    private String[][] tiles;
    public LevelOne() 
    {
        setBackground("img/BG/BG.png");
        cat = new Cat();
        addObject(cat, 200, 200);
        Yarn y = new Yarn();
        addObject(y, 600, 150);
        Yarn r = new Yarn();
        addObject(r, 300, 450);
        Yarn n = new Yarn();
        addObject(n, 500, 310);
        tiles = new String[7][9];
        buildWorld(); 
        showText("Score: " + cat.getScore() + " Lives: " + cat.getLives() , 10, 30, Color.BLACK);                                       
    }
    public void act()
    {
        if(cat.getScore() == 3)
        {
            Mayflower.setWorld(new LevelTwo());
        }
    }
    public void buildWorld()
    {
        for(int x = 0; x< tiles.length; x++)
        {
            tiles[x][4] = "ground";
        }
        for(int x = 0; x < tiles.length; x++)
        {
            for( int y=0;y < tiles[x].length; y++)
            {
                if(tiles[x][y] == "ground")
                {
                    addObject(new Block(),x*128, y*128);
                }
            }
        }
    }
    
}
