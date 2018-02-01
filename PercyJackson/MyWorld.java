import greenfoot.*;
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public void moveWorld(int deltaX, int deltaY)
    {

        List<Scrolling> allActors = getObjects(Scrolling.class);
        for(Actor a : allActors)
        {
            a.setLocation(a.getX()+deltaX, a.getY()+deltaY);    
        }
    }
}
