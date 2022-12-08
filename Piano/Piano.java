import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piano extends World
{
    private static String[] black_arr = {"a","s","d","f","g","h","j","k"};
    private static String[] white_arr = {"w","e","0","t","y","u"};
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Piano()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(550, 350, 1); 
        makeKeys();
    }
    
    private void makeKeys() 
    {
        // make the black keys
        for(int i = 0; i < black_arr.length; i++) {
            Key key = new Key(black_arr[i],black_arr[i]+".wav", "black.png", "black_push.png");
            addObject(key, 50 + (i*60), 135);
        }

        //make the white keys
        for(int i = 0; i < white_arr.length; i++) {
            if( ! white_arr[i].equals("0") ) {
                Key key = new Key(white_arr[i], white_arr[i]+".wav", "white.png", "black_push.png");
                addObject(key, 80 + (i*60), 85);
            }
        }
    }
}

