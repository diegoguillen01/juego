import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Guy extends Actor
{
    public Guy()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()-1750, image.getHeight()-2600);
        setImage(image);
    }
    public void act()
    {
        checkKey();
        end();
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
           Greenfoot.stop();
       }
    }
}
