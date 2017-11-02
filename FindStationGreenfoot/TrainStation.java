import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrainStation extends Actor
{
    private GreenfootImage myImage;
    boolean targetStation = false;
    public TrainStation(){
        myImage = getImage();
        myImage.scale(myImage.getWidth()/3, myImage.getHeight()/3);
    }
    /**
     * Act - do whatever the TrainStation wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void setTargetStation(){
        targetStation = true;
    }
    public boolean getTargetStation(){
        return targetStation;
    }
}
