import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      move();  
      tryToEat();// Add your action code here.
    } 
    
    public void move() 
    {
        
      if (isAtEdge()) {
          turn(50);
        }
        
      if (Greenfoot.isKeyDown("left")) {
          turn(-3);
        }
        
      if (Greenfoot.isKeyDown("right")) {
          turn(3);
      }
        
    }
    
    public void tryToEat() {  
        
      if (isTouching(Crab.class))
        {
          removeTouching(Crab.class); 
      } 
      
      if (isTouching(Anchor.class))
        {
          turn(30);
       }
      
    }
}
