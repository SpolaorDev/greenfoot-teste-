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
        super(300, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        kodok kodok = new kodok();
        addObject(kodok,148,434);
        candy1 candy1 = new candy1();
        addObject(candy1,259,69);
        candy2 candy2 = new candy2();
        addObject(candy2,12,139);
        candy3 candy3 = new candy3();
        addObject(candy3,157,43);
        candy4 candy4 = new candy4();
        addObject(candy4,285,203);
        candy5 candy5 = new candy5();
        addObject(candy5,112,227);
        no1 no1 = new no1();
        addObject(no1,189,129);
        no2 no2 = new no2();
        addObject(no2,40,15);
        no3 no3 = new no3();
        addObject(no3,7,249);
        Counter counter = new Counter("");
        addObject(counter,55,478);
        Counter2 counter2 = new Counter2("HP : ");
        addObject(counter2,246,478);
    }
}
