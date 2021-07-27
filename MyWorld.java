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
        super(600, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Guy guy = new Guy();
        addObject(guy,246,555);
        guy.setLocation(298,558);
    }
    public void act(){
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new virus(), Greenfoot.getRandomNumber(200) + 200, 0);
        }
        if(Greenfoot.getRandomNumber(10)<2){
            addObject(new buildingone(), Greenfoot.getRandomNumber(90), 0);
            addObject(new buildingone(), Greenfoot.getRandomNumber(90) + 500, 0);        
        }
    }
}
