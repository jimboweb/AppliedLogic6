import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
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
        super(600, 400, 1, false); 
        prepare();
    }

    public void moveWorld(int deltaX, int deltaY)
    {

        List<Actor> allActors = getObjects(Actor.class);
        for(Actor a : allActors)
        {
            a.setLocation(a.getX()+deltaX, a.getY()+deltaY);    
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Alligator alligator = new Alligator();
        addObject(alligator,455,199);
        Castle castle = new Castle();
        addObject(castle,128,91);
        Wall wall = new Wall();
        addObject(wall,172,281);
        Wall wall2 = new Wall();
        addObject(wall2,368,68);
        Player player = new Player();
        addObject(player, getWidth()/2, getHeight()/2);
    }
}
