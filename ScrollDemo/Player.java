import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private MyWorld myWorld;
    
    enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    };
    
    private int speed = 5;
    
    public void addedToWorld(World w){
        myWorld = (MyWorld)w;
    }
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        keyboardMove();
    }    
    
    private void keyboardMove(){

        if(Greenfoot.isKeyDown("up")){
            move(Direction.UP);
        } 
        if(Greenfoot.isKeyDown("down")){
            move(Direction.DOWN);
        }
         if(Greenfoot.isKeyDown("left")){
            move(Direction.LEFT);
        }
        if(Greenfoot.isKeyDown("right")){
            move(Direction.RIGHT);
        }
    }
    
    private void move(Direction d){
        switch(d){
            case UP:
                myWorld.moveWorld(0, speed);
                break;
            case DOWN:
                myWorld.moveWorld(0, -speed);
                break;
            case LEFT:
                myWorld.moveWorld(speed,0);
                break;
            case RIGHT:
                myWorld.moveWorld(-speed,0);
                break;
            default:
                break;
            
        }
    }
    
}
