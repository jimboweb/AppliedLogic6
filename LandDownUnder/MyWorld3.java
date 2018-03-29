import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld3 extends World
{
    int[][] platformLocations = {
        {200,200},
        {405,383},
        {266,312},
        {641,280},
        {767,436},
        {460,117},
        {166,487},
        {432,249},
        {247,136},
        {273,312},
        {54,344},
        {420,69},
        {440,250},
        {556,212},
        {171,214},
    };
   
    
    private void addPlatforms(){
        for(int[] location:platformLocations){
            Platform p = new Platform();
            addObject(p, location[0],location[1]);
        }
    }

    /**
     * Constructor for objects of class MyWorld3.
     * 
     */
    public MyWorld3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
      addPlatforms();
        prepare();
    }
    //public void act() { { getObjects(Kangaroo3.class).size(); if( getObjects(Kangaroo3.class).isEmpty()){ Greenfoot.setWorld(new MyWorld()); } } }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Kangaroo3 kangaroo3 = new Kangaroo3();
        addObject(kangaroo3,123,547);
        caamoflage2 caamoflage2 = new caamoflage2();
        addObject(caamoflage2,768,398);

        Trap trap = new Trap();
        addObject(trap,270,292);
        traps traps = new traps();
        addObject(traps,277,307);
        traps.setLocation(270,296);
    }
}
