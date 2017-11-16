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
    ArrayList<Integer> itinerary;
    TrainStation currentStation = null;
    TrainStation nextStation = null;
    TrainStation lastStation;
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
    private void goToStation(TrainStation targetStation){
        // TODO:
        // set nextStation to targetStation
    }
    
    /**
     * Act - do whatever the Train wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        checkStation();
        // TODO:
        // if currentStation not equal to nextStation
        //     
        //     int targetX is the x coordinate of targetStation
        //     int targetY is the y coordinate of targetStation
        //     turnTowards targetX and targetY
        //     move 5
        // run checkStation function
        
    }   
    private boolean checkStation(){
        Actor s = getOneIntersectingObject(TrainStation.class);
        if(s!=null){
            TrainStation station = (TrainStation)s;
            availableStations = station.getConnectedStations();
            currentStation = station;
            setLocation(station.getX(), station.getY());
            nextStation = null;
            return true;
        } else {
            if(currentStation.equals(null)){
                lastStation=currentStation;
                currentStation = null;
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
