import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piano extends World
{
    private static String[] weisse_taste = {"a","s","d","f","g","h","j","k"};
    private static String[] schwarze_taste = {"w","e","t","y","u"};
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Piano()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        makeKeys();
    }
    
    private void makeKeys() 
    {
        // make the black keys
        for(int i = 0; i < weisse_taste.length; i++) {
            //Key key = new Key(weisse_taste[i],weisse_taste[i]+".wav", "white-key.png", "white-key-down.png");
            //addObject(key, 54 + (i*63), 140);
        }

        /*// make the white keys
        for(int i = 0; i < weisse_taste.length-1; i++) {
            if( ! schwarze_taste[i].equals("") ) {
                Key key = new Key(schwarze_taste[i], schwarze_taste[i]+".wav", "black-key.png", "black-key-down.png");
                addObject(key, 85 + (i*63), 86);
            }
        }*/
    }
}

