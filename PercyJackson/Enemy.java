import greenfoot.*;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Scrolling
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("s"))
        {
            move(2);
            setRotation(90);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            move(2);
            setRotation(270);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move(2);
            setRotation(180);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(2);
            setRotation(0);
        }
    }    
}
