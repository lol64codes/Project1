import mayflower.*;

public class LevelTwo extends LevelOne
{
    private Cat cat;
    private Dog dog;
    private String[][] tiles;
   
    public LevelTwo()
    {
        setBackground("img/BG/BG.png");
        
        cat = new Cat();
        dog=new Dog();
        addObject(cat, 100, 496);
        Yarn y = new Yarn();
        addObject(y, 500, 150);
        Yarn r = new Yarn();
        addObject(r, 200, 450);
        Yarn n = new Yarn();
        addObject(n, 400, 320);
       
        buildWorld(); 
        
        showText("Score: " + cat.getScore() + " Lives: " + cat.getLives() , 10, 30, Color.BLACK);                                
    }
    public void act()
    {
       
    }
    public void buildWorld()
    {
         tiles = new String[7][9];
        for(int x = 0; x< tiles.length; x++)
        {
            tiles[x][4]="ground";
           
        }
        for(int x = 0; x< tiles.length; x++)
        {
            for( int y=0;y< tiles[x].length; y++)
            {
                if(tiles[x][y]=="ground")
                {
                    addObject(new Block(),x*128, y*128);
                }
            }
        }
    }
}
