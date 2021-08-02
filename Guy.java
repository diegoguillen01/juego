import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Guy extends Actor
{
    private int score = 0;
    public Guy()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()-1750, image.getHeight()-2600);
        setImage(image);
    }
    public void act()
    {
        getWorld().showText("Score = " + score, 100, 20);
        checkKey();
        end();
        addScore();
    }
    public void checkKey(){
        if(Greenfoot.isKeyDown("left")){
            if(getX()>= 150){
                setLocation(getX() -3, getY());
            }
        }
        if(Greenfoot.isKeyDown("right")){
            if(getX()<= 450){
                setLocation(getX() +3, getY());
            }
        }
        if(Greenfoot.isKeyDown("up")){
                setLocation(getX(), getY() -3);
        }
        if(Greenfoot.isKeyDown("down")){
                setLocation(getX(), getY() +3);
        }
    }
    public void end(){
       if(isTouching(Guy.class)||isTouching(virus.class)){
           World myWorld = getWorld();
           Greenfoot.stop();
           GameOver gameover = new GameOver();
           myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
        }   
    }
    public void addScore(){
        if(isTouching(vaccine.class)){
            score = score + 5;
            removeTouching(vaccine.class);
        }
    }
    }

