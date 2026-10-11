
/**
 * Write a description of class Precision here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Precision extends Enemy
{
   private double newSpeed;
   private int health;
   
   /**
     * Constructor for Precision.
     * @param x The initial x-coordinate.
     * @param y The initial y-coordinate.
     * @param width The width of the enemy.
     * @param height The height of the enemy.
     * @param speed The falling speed of the enemy.
     * @param health The amount of times an enemy needs to be hit
     */
   
   public Precision(int x, int y, int width, int height, int speed, int health) {
        super(x, y, width, height, speed); // Call superclass constructor
        this.health = health;
    }

}
