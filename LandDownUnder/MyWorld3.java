import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld3 extends World
{

    /**
     * Constructor for objects of class MyWorld3.
     * 
     */
    public MyWorld3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 

        prepare();
    }
public void act() { { getObjects(Kangaroo3.class).size(); if( getObjects(Kangaroo3.class).isEmpty()){ Greenfoot.setWorld(new MyWorld()); } } }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Kangaroo3 kangaroo3 = new Kangaroo3();
        addObject(kangaroo3,123,547);
        caamoflage2 caamoflage2 = new caamoflage2();
        addObject(caamoflage2,698,534);
        Trap trap = new Trap();
        addObject(trap,442,547);
        Platform platform12 = new Platform();
        addObject(platform12,177,471);
        Platform platform13 = new Platform();
        addObject(platform13,405,383);
        Platform platform14 = new Platform();
        addObject(platform14,641,280);
        Platform platform15 = new Platform();
        addObject(platform15,767,436);
        Platform platform16 = new Platform();
        addObject(platform16,787,82);
        Platform platform17 = new Platform();
        addObject(platform17,460,117);
        Platform platform18 = new Platform();
        addObject(platform18,436,249);
        Platform platform19 = new Platform();
        addObject(platform19,247,136);
        Platform platform20 = new Platform();
        addObject(platform20,273,312);
        Platform platform21 = new Platform();
        addObject(platform21,54,344);
        Platform platform22 = new Platform();
        addObject(platform22,79,206);
        caamoflage2.setLocation(814,103);
        caamoflage2.setLocation(789,50);
        Platform platform11 = new Platform();
        platform11.setLocation(128,194);
        Platform platform9 = new Platform();
        platform9.setLocation(266,312);
        Platform platform2 = new Platform();
        platform2.setLocation(396,389);
        trap.setLocation(276,291);
        trap.setLocation(274,293);
        Platform platform8 = new Platform();
        platform8.setLocation(263,142);
        Platform platformkeo = new Platform();
        addObject(platformkeo,53,69);
        platform12.setLocation(74,62);
        Platform platform = new Platform();

        platform.setLocation(119,62);
        platform.setLocation(131,471);
        platform.setLocation(147,478);
        platform12.setLocation(53,69);
        platform12.setLocation(179,488);
        removeObject(platform12);
        Platform platformdog = new Platform();
        addObject(platformdog,163,505);
        platformdog.setLocation(166,487);
    }
}
