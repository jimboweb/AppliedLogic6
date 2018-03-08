import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kangaroo3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kangaroo3 extends Actor
{
    boolean ground = false;
    double xDoub = 0;
    double yDoub = 0;
    double deltaX = 0;
    double deltaY = 0;
    double gravity = 0.1;
    GreenfootImage myImage;
    int height;
    World myWorld2;
    int worldHeight;
    boolean pointingRight = true;
        /**
     * Act - do whatever the Kangaroo3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    void landOnPlatform(Platform p){
        deltaX=0;
        deltaY=0;
        ground = true;
        int pY = p.getY();
        int px = p.getX();
        //GreenfootImage i=Platform.getImage();
    }
    
    public Kangaroo3(){
        myImage = getImage();
        height = myImage.getWidth();
    }
    
    public void addedToWorld(World w){
        myWorld2 = w;
        worldHeight = w.getHeight();
    }
    public void act() 
    {
        move();
        keyAction();
        Platform p = checkForPlatform();
        if (p!=null)
        {
            landOnPlatform(p);
        }
      removeTouching(caamoflage2.class);
    }    
    
    private void move(){
        if(ground){
            return;
        } 
        drift(xDoub,yDoub);
        ground = findGround();
        
        
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
        return getY() >= worldHeight - height/2;
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
            setLocation(getX(), getY() - height/2+1);
        }
    }
    
    private void fall(){
        deltaY+=gravity;
    }
    
    Platform checkForPlatform(){
        Platform p=(Platform)getOneObjectAtOffset(0, height/2+5, Platform.class);
       return p;
    }
}
