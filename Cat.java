import mayflower.*;
public class Cat extends AnimatedActor
{
    private int score = 0;
    private int lives = 3;
    private Animation walk;
    MayflowerImage i = new MayflowerImage("img/cat/Walk (1).png");
    public Cat()
    {
        String[] catsFrame = new String[10];
        i.scale(0.3);
        setImage(i);
        for (int x = 0; x < catsFrame.length; x++)
        {
            catsFrame[x] = "img/cat/Walk (" + (x + 1) + ").png";
        }
        walk = new Animation(50, catsFrame);
        setAnimation(walk);
        walk.scale(0.3);
    }
    public void act()
    {
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        if (Mayflower.isKeyDown(Keyboard.KEY_RIGHT))
        {
            if (x <= 800 - w)
            {
                setLocation (x + 3, y);
            }
            else
            {
                setLocation (0, y);
            }
        }
        if (Mayflower.isKeyDown(Keyboard.KEY_LEFT))
        {
            if (x >= 0)
            {
                setLocation (x - 3, y);
            }
            else
            {
                setLocation (700, y);
            }
        }
        if (Mayflower.isKeyDown(Keyboard.KEY_UP) && (y > 0))
        {
            setLocation(x, y - 3);
        }
        else if (y <= 510 - h)
        {
            if (Mayflower.isKeyDown(Keyboard.KEY_RIGHT) && (x <= 800 - w)) 
            {
                setLocation (x + 1, y + 1);
            }
            else if (Mayflower.isKeyDown(Keyboard.KEY_LEFT) && (x >= 0)) 
            {
                setLocation (x - 1, y + 1);
            }
            else {
                setLocation (x, y + 1);
            }
        }
        super.act();
    }
    public void increaseScore(int amount)
    {
        score = score + amount;
        updateText();
    }
    public void increaseLives(int amount)
    {
        lives = lives - amount;
    }
    public void decreaseLives(int amount)
    {
        lives = lives - amount;
        updateText();
    }
    public int getLives()
    {
        return lives;
    }
    public int getScore()
    {
        return score;
    }
    private void updateText()
    {
        World w = getWorld();
        w.removeText(10, 30);
        w.showText("Score: " + score + " Lives: " + lives, 10, 30, Color.BLACK);
    }
}
