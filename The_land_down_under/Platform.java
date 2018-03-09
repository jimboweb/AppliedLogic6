import greenfoot.*;

/**
 * Write a description of class Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Actor
{
    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void addedToWorld(World w){
        drawImage();
    }
    
    private void drawImage(){
        GreenfootImage newImage = new GreenfootImage(100,10);
        newImage.setColor(Color.RED);
        newImage.fillRect(0,0,100,10);
        setImage(newImage);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
