import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
/**
 * Write a description of class Train here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Train extends Actor
{
    GreenfootImage myImage;
    TrainWorld myWorld;
    ArrayList<Integer> availableStations;
    ArrayList<TrainStation> allStations;
    int currentStation = -1;
    int nextStation = -1;
    int lastStation;
    private Queue<Integer> itinerary = new LinkedList<Integer>();
    public Train(ArrayList<TrainStation> allStations){
        myImage = getImage();
        myImage.scale(myImage.getWidth()/3, myImage.getHeight()/3);
        availableStations = new ArrayList<>();
        this.allStations = allStations;

    }
    
    private void setup(){
        for(int i=0;i<3;i++){
            goToStation(i);
        }
    }
    
    
    public void addedToWorld(World w)
    {
        myWorld = (TrainWorld)w;
        setup();
    }
    
    
    /**
     * Act - do whatever the Train wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkStation();
        moveTowardsStation();
    }   
    
    private void goToStation(int stationNumber){
        itinerary.add(stationNumber);
        if(nextStation==-1){
            nextStation = itinerary.poll();
        }
    }
    
    private void moveTowardsStation(){
        if(currentStation!=nextStation && nextStation!=-1){
            TrainStation next = myWorld.getStation(nextStation);
            TrainStation touchingStation = (TrainStation)getOneIntersectingObject(TrainStation.class);
            if(touchingStation!=null){
                    if(!touchingStation.equals(next)){
                    int nextStationX = next.getX();
                    int nextStationY = next.getY();
                    turnTowards(nextStationX,nextStationY);
                    move(5);
                } else {
                    currentStation = next.getStationNumber();
                    setLocation(next.getX(), next.getY());
                    if(!itinerary.isEmpty()){
                        nextStation = itinerary.poll();
                    }
                } 
            } 
        }
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
