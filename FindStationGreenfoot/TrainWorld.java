import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrainWorld extends World
{
    TrainStation trainstation1;
    TrainStation trainstation2;
    TrainStation trainstation3;
    TrainStation trainstation4;
    Train train;
    ArrayList<TrainStation> stations;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public TrainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        stations = new ArrayList<TrainStation>();
        
        addStation(100,200);
        addStation(400,50);
        addStation(400,200);
        addStation(400,350);
        stations.get(0).connectToStation(stations.get(1));
        stations.get(0).connectToStation(stations.get(2));
        stations.get(0).connectToStation(stations.get(3));
        train = new Train();
        addObject(train,100,200);
        drawLines();
        
        
        //Line line12 = new Line(stations.get(0), stations.get(1));
        //addObject(line12,0,0);
         //Line line13 = new Line(stations.get(0), stations.get(2));
        //addObject(line13,0,0);
         //Line line14 = new Line(stations.get(0), stations.get(3));
        //addObject(line14,0,0);
   }
   
   private void setTargetStation(){
       int targetStation = Greenfoot.getRandomNumber(3)+2;
       switch(targetStation){
           case 2:
                trainstation2.setTargetStation();
            case 3:
                trainstation3.setTargetStation();
             case 4:
                trainstation4.setTargetStation();
            default:
                trainstation4.setTargetStation();
            
       }
    }
    public void youWon(){
       showText("You won", getWidth()/2, getHeight()/2); 
    }
    
    public void addStation(int x, int y){
        TrainStation ts = new TrainStation();
        addObject(ts, x, y);
        stations.add(ts);
    }
    private void drawLines(){
        for(TrainStation s:stations){
            ArrayList<Integer> csNums = s.getConnectedStations();
            for(Integer csNum:csNums){
                TrainStation cs = stations.get(csNum);
                if(cs!=null && cs.getStationNumber()>s.getStationNumber()){
                    Line l = new Line(s,cs, this);
                }
            }
        }
    }
    public TrainStation getStation(int csNum){
        if(stations.size()<csNum){
            return stations.get(csNum);
        }
        return null;
    }

}


