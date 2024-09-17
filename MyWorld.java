import mayflower.*;

 
public class MyWorld extends World {

    private Cat cat;
    private Dog dog;
    private String[][]tiles;
    public MyWorld() 
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
        tiles=new String[6][8];
        buildWorld(); 
                                                 
    }
    public void act()
    {
    }
    public void buildWorld()
    {
        for(int x = 0; x< tiles.length; x++)
        {
            for( int y=0;y< tiles[x].length; y++)
            {
                tiles[x][y]="";
            }
        }
        for(int y=0;y<tiles[4].length;y++)
        {
            tiles[4][y]="ground";
        }
        for(int x = 0; x< tiles.length; x++)
        {
            for( int y=0;y< tiles[x].length; y++)
            {
                if(tiles[x][y]=="ground")
                {
                    addObject(new Block(),x*100, y*98);
                }
            }
        }
    }
}
