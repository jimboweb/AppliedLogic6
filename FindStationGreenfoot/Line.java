import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and station1Info)

/**
 * Write a description of class Line here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Line extends Actor
{
     Actor station1;
    Actor station2;
    int station1X;
    int station1Y;
    int station2X;
    int station2Y;
    GreenfootImage myImage;
    /**
     * Act - do whatever the LineOfSight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Line (Actor station1, Actor station2, World w)
    {
        this.station1 = station1;
        this.station2 = station2;
        setImage(new GreenfootImage(1,1));
        w.addObject(this,0,0);
    }
    public void act() 
    {
        if(station1.getWorld()!=null && station2.getWorld()!=null)
        {
            station1X = station1.getX();
            station1Y = station1.getY();
            station2X = station2.getX();
            station2Y = station2.getY();
            int myX = (station2X + station1X)/2;
            int myY = (station2Y + station1Y)/2;
            setLocation(myX, myY);
            turnTowards(station1X, station1Y);
            int d = (int)Math.sqrt(Math.pow((station2X-station1X),2)+Math.pow((station2Y-station1Y),2));
            setImage(new GreenfootImage(d,1));
            myImage = getImage();
            myImage.setColor(Color.BLACK);
            myImage.drawLine(0,0,d,0);
   
        }
    }    
}
