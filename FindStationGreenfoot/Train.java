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
    ArrayList<Integer> availableStations;
    ArrayList<TrainStation> allStations;
    int currentStation = -1;
    int nextStation = -1;
    int lastStation;
    public Train(ArrayList<TrainStation> allStations){
        myImage = getImage();
        myImage.scale(myImage.getWidth()/3, myImage.getHeight()/3);
        availableStations = new ArrayList<>();
        this.allStations = allStations;
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
        checkStation();
        
    }   
    private boolean checkStation(){
        Actor s = getOneIntersectingObject(TrainStation.class);
        if(s!=null){
            TrainStation station = (TrainStation)s;
            availableStations = station.getConnectedStations();
            currentStation = station.getStationNumber();
            setLocation(station.getX(), station.getY());
            nextStation = -1;
            return true;
        } else {
            if(currentStation!=-1){
                lastStation=currentStation;
                currentStation = -1;
            }
        }
        return false;
    }
    private TrainStation getStations(int stationNumber){
        if(allStations.size()<stationNumber){
            return allStations.get(stationNumber);
        }
        throw new IndexOutOfBoundsException("Station " + stationNumber + " doesn't exist");
    }
}
