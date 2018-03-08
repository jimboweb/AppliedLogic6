import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    }

    public void act(){  
        getObjects(caamoflage.class).size();
        if( getObjects(caamoflage.class).isEmpty()){
            Greenfoot.setWorld(new MyWorld2());   
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Kangaroo kangaroo = new Kangaroo();
        addObject(kangaroo,293,287);

        Platform platform = new Platform();
        addObject(platform,508,290);

        Platform platform2 = new Platform();
        addObject(platform2,395,256);
        Platform platform3 = new Platform();
        addObject(platform3,298,228);
        Platform platform4 = new Platform();
        addObject(platform4,203,267);
        Platform platform5 = new Platform();
        addObject(platform5,132,291);
        Platform platform6 = new Platform();
        addObject(platform6,60,336);
        platform6.setLocation(60,336);
        platform6.setLocation(60,336);
        platform6.setLocation(60,336);
        platform6.setLocation(60,336);
        platform6.setLocation(60,336);
        platform6.setLocation(60,336);
        platform6.setLocation(60,336);
        platform6.setLocation(60,336);
        platform6.setLocation(60,336);
        platform6.setLocation(60,336);
        platform6.setLocation(547,584);
        platform.setLocation(460,548);
        platform2.setLocation(369,510);
        platform5.setLocation(288,472);
        platform4.setLocation(206,434);
        platform3.setLocation(136,386);
        kangaroo.setLocation(692,547);
        Platform platform7 = new Platform();
        addObject(platform7,88,349);
        Platform platform8 = new Platform();
        addObject(platform8,39,314);
        platform8.setLocation(219,252);
        Platform platform9 = new Platform();
        addObject(platform9,339,217);
        platform9.setLocation(337,214);
        Platform platform10 = new Platform();
        addObject(platform10,451,176);
        Platform platform11 = new Platform();
        addObject(platform11,586,229);
        Platform platform12 = new Platform();
        addObject(platform12,741,196);
        Platform platform13 = new Platform();
        addObject(platform13,815,58);
        platform12.setLocation(766,194);
        Platform platform14 = new Platform();
        addObject(platform14,679,331);
        Platform platform15 = new Platform();
        addObject(platform15,722,329);
        Platform platform16 = new Platform();
        addObject(platform16,638,329);
        platform9.setLocation(332,214);
        platform10.setLocation(433,161);
        platform11.setLocation(554,234);
        platform12.setLocation(649,173);
        platform13.setLocation(804,60);
        platform15.setLocation(766,329);
        platform14.setLocation(694,329);
        Platform platform17 = new Platform();
        addObject(platform17,620,418);
        platform17.setLocation(703,312);
        platform11.setLocation(546,233);
        Platform platform18 = new Platform();
        addObject(platform18,706,176);
        platform18.setLocation(713,173);
        caamoflage caamoflage = new caamoflage();
        addObject(caamoflage,800,42);
        caamoflage caamoflage2 = new caamoflage();
        addObject(caamoflage2,822,42);
        caamoflage caamoflage3 = new caamoflage();
        addObject(caamoflage3,837,42);
        caamoflage caamoflage4 = new caamoflage();
        addObject(caamoflage4,795,43);
        caamoflage caamoflage5 = new caamoflage();
        addObject(caamoflage5,819,46);
        caamoflage caamoflage6 = new caamoflage();
        addObject(caamoflage6,781,43);
        caamoflage caamoflage7 = new caamoflage();
        addObject(caamoflage7,826,43);
        caamoflage caamoflage8 = new caamoflage();
        addObject(caamoflage8,793,43);
        caamoflage caamoflage9 = new caamoflage();
        addObject(caamoflage9,781,47);
        caamoflage caamoflage10 = new caamoflage();
        addObject(caamoflage10,786,55);
        caamoflage caamoflage11 = new caamoflage();
        addObject(caamoflage11,809,55);
        caamoflage caamoflage12 = new caamoflage();
        addObject(caamoflage12,821,55);
        caamoflage caamoflage13 = new caamoflage();
        addObject(caamoflage13,832,55);
        caamoflage caamoflage14 = new caamoflage();
        addObject(caamoflage14,808,59);
    }
}
