import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test extends World
{
    int[][] platformLocations = {
        {100,200},
        {50,300},
        {350,20},
        {200,200}
    };
    /**
     * Constructor for objects of class test.
     * 
     */
    public test()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addPlatforms();
    }
    
    private void addPlatforms(){
        for(int[] location:platformLocations){
            Platform p = new Platform();
            addObject(p, location[0],location[1]);
        }
    }
}
