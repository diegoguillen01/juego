import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class buildingone extends props
{
    public buildingone()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()-1870, image.getHeight()-2650);
        setImage(image);
    }
    public void act(){
        int speed = 2;
        buildingone a = new buildingone();
        Actor i = getOneIntersectingObject(buildingone.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
