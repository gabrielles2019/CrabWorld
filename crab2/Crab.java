import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if (isAtEdge()) {
          turn(17);
        }
        move(4);
      if (Greenfoot.getRandomNumber(100) < 7) {
          turn(Greenfoot.getRandomNumber(80)-46);
        }
        
      if (isTouching(Worm.class))
       {
          removeTouching(Worm.class); 
       }
    }    
}
