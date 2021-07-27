import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class virus extends props
{
    public virus()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()-580, image.getHeight()-520);
        setImage(image);
    }
    public void act()
    {
        int speed = 3;
        virus a = new virus();
        Actor i = getOneIntersectingObject(virus.class);
        move(speed);
        checkdouble(i);
        end();
    }
}