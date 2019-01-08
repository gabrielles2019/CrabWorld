import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
      move();
      tryToEat();
    }
    
    public void move() 
    {
        
      if (isAtEdge()) {
          turn(17);
        }
        move(4);
      if (Greenfoot.getRandomNumber(100) < 9) {
          turn(Greenfoot.getRandomNumber(90)-40);
        }
        
    }
        
    public void tryToEat() {  
        
      if (isTouching(Worm.class))
        {
          removeTouching(Worm.class);
          Greenfoot.playSound("eating.wav");
       }  
       
      if (isTouching(Anchor.class))
        {
          turn(30);
       }
    }
}
