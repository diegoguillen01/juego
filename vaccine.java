import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class vaccine extends props
{
    public vaccine()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()-450, image.getHeight()-650);
        setImage(image);
        
    }
    public void act()
    {
        int speed = 2;
        vaccine a = new vaccine();
        Actor i = getOneIntersectingObject(vaccine.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
