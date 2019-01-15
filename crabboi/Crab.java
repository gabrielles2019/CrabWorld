import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    private static GreenfootImage image1;
    private static GreenfootImage image2;
    private int wormsEaten;
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Crab() {
	image1 = new GreenfootImage("crab.png");
	image2 = new GreenfootImage("crab2.png");
	wormsEaten = 0;
	setImage(image1);
}

    
    public void act() {
      move();
      tryToEat();
    }
    
    public void move() 
    {
        move(4);
        if (getImage() == image1) {
            setImage(image2);
        } else {
            setImage(image1);
        }

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
          wormsEaten++;
          if (wormsEaten >= 10) {
              Greenfoot.playSound("loser.wav");
              Greenfoot.stop();
            }
          Greenfoot.playSound("eating.wav");
       }  
       
      if (isTouching(Anchor.class))
        {
          turn(30);
       }
    }
}
