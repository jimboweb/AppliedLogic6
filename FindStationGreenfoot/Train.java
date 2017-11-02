import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Train here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Train extends Actor
{
    GreenfootImage myImage;
    public Train(){
        myImage = getImage();
        myImage.scale(myImage.getWidth()/3, myImage.getHeight()/3);

    }
    /**
     * Act - do whatever the Train wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    public void checkStation(){
        Actor s = getOneIntersectingObject(TrainStation.class);
        if(s!=null){
            TrainStation station = (TrainStation)s;
        }
    }
}
