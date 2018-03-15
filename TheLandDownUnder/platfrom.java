import greenfoot.*;

/**
 * Write a description of class platfrom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class platfrom extends Actor
{
    /**
     * Act - do whatever the platfrom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void addedToWorld(World w){
        drawImage();
    }
    
    private void drawImage(){
        GreenfootImage newImage = new GreenfootImage(108,10);
        newImage.setColor(Color.BLUE);
        newImage.fillRect(0,0,newImage.getWidth(),newImage.getHeight());
        setImage(newImage);
    } 
}
