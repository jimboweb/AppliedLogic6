import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kangaroo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kangaroo extends Actor
{
    boolean ground = false;
    double xDoub = 0;
    double yDoub = 0;
    double deltaX = 0;
    double deltaY = 0;
    double gravity = 0.1;
    GreenfootImage myImage;
    int height;
    World myWorld;
    int worldHeight;
    boolean pointingRight = true;
        /**
     * Act - do whatever the Kangaroo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Kangaroo(){
        myImage = getImage();
        height = myImage.getWidth();
    }
    
    public void addedToWorld(World w){
        myWorld = w;
        worldHeight = w.getHeight();
    }
    public void act() 
    {
        ground = findGround();
        move();
        keyAction();
    }    
    
    private void move(){
        ground = findGround();
        if(ground){
            land();
            return;
        } 
        drift(xDoub,yDoub);
        
        fall();
    }
    
    private void keyAction(){
        if(Greenfoot.isKeyDown("up")){
            jump();
        }
        if(Greenfoot.isKeyDown("right")){
            if(!pointingRight){
                myImage.mirrorHorizontally();
            }
            pointingRight = true;
        }
        if(Greenfoot.isKeyDown("left")){
            if(pointingRight){
                myImage.mirrorHorizontally();
            }
            pointingRight = false;
        }
    }
    
    private void land(){
        deltaX = 0;
        deltaY = 0;
        setLocation(getX(), worldHeight-height/2);
    }
    
    private boolean findGround(){

        return getY() >= worldHeight - height/2 && deltaY > 0;
    }
    
    
    private void drift(double xFloat, double yFloat){
        xFloat += deltaX;
        yFloat += deltaY;
        int xInt = (int)xFloat;
        int yInt = (int)yFloat;
        setLocation(getX() + xInt, getY() + yInt);
    }
    
    private void jump(){
        if(ground){
            ground = false;
            deltaY = -5;
            deltaX = pointingRight?1:-1;
            //setLocation(getX(), getY() - height/2+1);
        }
    }
    
    private void fall(){
        deltaY+=gravity;
    }
    

}
