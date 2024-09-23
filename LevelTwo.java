import mayflower.*;

public class LevelTwo extends LevelOne
{
    private Cat cat;
    private Dog dog;
    private String[][]tiles;
   
    public LevelTwo()
    {
        setBackground("img/BG/BG.png");
        
        
        cat = new Cat();
        addObject(cat, 100, 496);
        
        tiles=new String[7][9];
        buildWorld(); 
    }
    public void act()
    {
       
    }
    public void buildWorld()
    {
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
