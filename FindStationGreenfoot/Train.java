import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Train here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Train extends Actor
{
    GreenfootImage myImage;
    World myworld;
    public Train(){
        myImage = getImage();
        myImage.scale(myImage.getWidth()/3, myImage.getHeight()/3);

    }
    public void addedToWorld(World w)
    {
        myworld = w;
    }
    /**
     * Act - do whatever the Train wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        ArrayList<TrainStation> stations = (ArrayList<TrainStation>)myworld.getObjects(TrainStation.class);
    }   
    public void checkStation(){
        Actor s = getOneIntersectingObject(TrainStation.class);
        if(s!=null){
            TrainStation station = (TrainStation)s;
        }
    }
}
