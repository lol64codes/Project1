import mayflower.*;
public class Animation
{
    private MayflowerImage[] frames;
    private int frameRate;
    private int currentFrame;
    public Animation(int frame, String[] array)
    {
        frames = new MayflowerImage[array.length];
        frameRate = frame;
        currentFrame = 0;
        for (int i = 0; i < array.length; i++)
        {
            frames[i] = new MayflowerImage(array[i]);
        }
    }
    public MayflowerImage getNextFrame()
    {
        currentFrame++;
        if (currentFrame % frames.length == 0)
        {
            currentFrame = 0;
        }
        MayflowerImage frame = frames[currentFrame];
        return frames[currentFrame];
    }
    public int getFrameRate()
    {
        return frameRate;
    }
    public void scale(int w, int h)
    {
        for (int i = 0; i < frames.length; i++)
        {
            frames[i].scale(w, h); 
        }

    }
    public void setTransparency(int percent)
    {
        for (int i = 0; i < frames.length; i++)
        {
            frames[i].setTransparency(percent); 
        }
    }
}
