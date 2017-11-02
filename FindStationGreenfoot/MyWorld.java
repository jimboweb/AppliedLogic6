import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    TrainStation trainstation1;
    TrainStation trainstation2;
    TrainStation trainstation3;
    TrainStation trainstation4;
    Train train;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
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
        trainstation1 = new TrainStation();
        addObject(trainstation1,106,198);
        trainstation2 = new TrainStation();
        addObject(trainstation2,300,79);
        trainstation3 = new TrainStation();
        addObject(trainstation3,393,201);
        trainstation4 = new TrainStation();
        addObject(trainstation4,339,327);
        train = new Train();
        addObject(train,108,193);
        
        
        
        Line line12 = new Line(trainstation1, trainstation2);
        addObject(line12,0,0);
         Line line13 = new Line(trainstation1, trainstation3);
        addObject(line13,0,0);
         Line line14 = new Line(trainstation1, trainstation4);
        addObject(line14,0,0);
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
    
    
}


