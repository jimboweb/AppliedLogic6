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
        {100,200},
        {50,300},
        {350,20},
        {200,200}
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
        addObject(caamoflage2,698,534);
    
        
   
      

     
       

      
       
    }
}
