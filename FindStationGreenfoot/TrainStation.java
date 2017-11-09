import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.Arrays;
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
    ArrayList<Integer> connectedStations;
    private int stationNumber;
    private static int nextStationNumber = 0;
    public TrainStation(){
        myImage = getImage();
        myImage.scale(myImage.getWidth()/3, myImage.getHeight()/3);
        stationNumber = nextStationNumber;
        nextStationNumber++;
        connectedStations = new ArrayList<>();
    }
   public TrainStation(ArrayList<Integer> connectedStations){
        myImage = getImage();
        myImage.scale(myImage.getWidth()/3, myImage.getHeight()/3);
        this.connectedStations=connectedStations;
        stationNumber = nextStationNumber;
        nextStationNumber++;
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
    public void clearTargetStation(){
        targetStation = false;
    }
    public boolean getTargetStation(){
        return targetStation;
    }
    public int getStationNumber(){
        return stationNumber;
    }
    /**
     * This runs addConnectedStation twice, once on self 
     */
    public void connectToStation(TrainStation s){
        addConnectedStation(s.getStationNumber());
        s.addConnectedStation(stationNumber);
    }
    public void addConnectedStation(int stationNumber){
        connectedStations.add(stationNumber);
    }
    public ArrayList<Integer> getConnectedStations(){
        return connectedStations;
    }
}
