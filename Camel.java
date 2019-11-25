import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A camel with an image that is flipped when the camel change direction.
 * 
 * @author Rikard Karlsson 
 * @version 19-11-08
 */
public class Camel extends Actor
{
    // objectvariable
    private GreenfootImage leftImage;
    private GreenfootImage rightImage;
    
    //construktor
    public Camel()
    {
        leftImage = (new GreenfootImage("camel.png"));
        leftImage.mirrorHorizontally();
        rightImage = (new GreenfootImage("camel.png"));
    }
    
    // methods
    public void act()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-5);
            // look left
            setImage(leftImage);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(5);
            // look right
            setImage(rightImage);
        }
    }
}
