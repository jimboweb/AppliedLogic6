import greenfoot.*;

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    MyWorld myWorld;
    
    public void addedToWorld(World w){
        myWorld = (MyWorld)w ;
    }
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("down"))
        {
           myWorld.moveWorld(0, -6);
        }   
       if(Greenfoot.isKeyDown("up"))
        {
           myWorld.moveWorld(0, 6);
    }    
       if(Greenfoot.isKeyDown("right"))
        {
           setRotation(0);
           myWorld.moveWorld(-6, 0);
    }    
       if(Greenfoot.isKeyDown("left"))
        {
           myWorld.moveWorld(6, 0);
    }  
    
    
}

    void move(int x,int y){
        myWorld.moveWorld(-x, -y);
    }   

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
