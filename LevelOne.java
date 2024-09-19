import mayflower.*;
public class LevelOne extends World {
    private Cat cat;
    private String[][] tiles;
    public LevelOne()
    {
        setBackground("img/BG/BG.png");
        //cat = new Cat();
        //addObject(cat, 100, 100);
        //dog = new Dog()
        //addObject(dog, 100, 200);
        //jack = new Jack();
        //addObject(jack, 100, 300);
        //ninja = new Ninja();
        //addObject(ninja, 100, 400);
        tiles = new String[7][5];
        buildWorld();
        showText("Score: " + cat.getScore() + " Lives: " + cat.getLives() , 10, 30, Color.BLACK);
                                                 
    }
    public void act()
    {
        
    }
    public void buildWorld()
    {
        for (int x = 0; x < tiles.length; x++)
        {
            tiles[x][4]="ground";
        }
        for (int x = 0; x< tiles.length; x++)
        {
            for (int y=0; y< tiles[x].length; y++)
            {
                if (tiles[x][y] == "ground")
                {
                    addObject(new Block(), x * 128, y * 128);
                }
            }
        }
    }
}
