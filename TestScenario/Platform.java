import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Actor
{
    public void addedToWorld(World w){
        GreenfootImage newImage = new GreenfootImage(80,20);
        newImage.setColor(Color.RED);
        newImage.fillRect(0, 0, newImage.getWidth(), newImage.getHeight());
        setImage(newImage);
    }
    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
