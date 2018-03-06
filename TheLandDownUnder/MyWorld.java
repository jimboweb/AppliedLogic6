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
        super(789, 590, 1); 
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
        kangaroo.setLocation(292,479);
        kangaroo.setLocation(149,526);
        snake snake = new snake();
        addObject(snake,621,528);
        platfrom platfrom = new platfrom();
        addObject(platfrom, 599, 419);
        platfrom platfrom2 = new platfrom();
        addObject(platfrom2, 191, 437);
        platfrom platfrom3 = new platfrom();
        addObject(platfrom3, 346, 358);
        platfrom platfrom4 = new platfrom();
        addObject(platfrom4, 36, 255);
        platfrom platfrom5 = new platfrom();
        addObject(platfrom5, 356, 97);
        platfrom platfrom6 = new platfrom();
        addObject(platfrom6, 367, 214);
        platfrom platfrom7 = new platfrom();
        addObject(platfrom7, 731, 204);
        platfrom platfrom8 = new platfrom();
        addObject(platfrom8, 543, 80);
        platfrom platfrom9 = new platfrom();
        addObject(platfrom9, 38, 85);
    }
}
