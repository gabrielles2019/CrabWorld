import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
    }
    
    private void prepare() {
	for(int i = 0; i < 10; i++) {
	Worm worm = new Worm();
int x = Greenfoot.getRandomNumber(getWidth());
int y = Greenfoot.getRandomNumber(getHeight());
	addObject(worm,x,y);
}

for(int i = 0; i < 5; i++) {
	Anchor anchor = new Anchor();
int x = Greenfoot.getRandomNumber(getWidth());
int y = Greenfoot.getRandomNumber(getHeight());
	addObject(anchor,x,y);
}

for(int i = 0; i < 2; i++) {
	Starfish starfish = new Starfish();
int x = Greenfoot.getRandomNumber(getWidth());
int y = Greenfoot.getRandomNumber(getHeight());
	addObject(starfish,x,y);
}

for(int i = 0; i < 7; i++) {
	Crab crab = new Crab();
int x = Greenfoot.getRandomNumber(getWidth());
int y = Greenfoot.getRandomNumber(getHeight());
	addObject(crab,x,y);
}

for(int i = 0; i < 1; i++) {
	Lobster lobster = new Lobster();
int x = Greenfoot.getRandomNumber(getWidth());
int y = Greenfoot.getRandomNumber(getHeight());
	addObject(lobster,x,y);
}


}

}
