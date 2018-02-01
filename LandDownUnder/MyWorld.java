import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Kangaroo kangaroo = new Kangaroo();
        addObject(kangaroo,293,287);

        Platform platform = new Platform();
        addObject(platform,508,290);

        Platform platform2 = new Platform();
        addObject(platform2,395,256);
        Platform platform3 = new Platform();
        addObject(platform3,298,228);
        Platform platform4 = new Platform();
        addObject(platform4,203,267);
        Platform platform5 = new Platform();
        addObject(platform5,132,291);
        Platform platform6 = new Platform();
        addObject(platform6,60,336);
    }
}
