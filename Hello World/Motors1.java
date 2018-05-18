import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;

/**
 * Write a description of class Motors here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Motors1
{
    public static void main( String[] args )
    {
        System.out.println( "Program 1" );
        Button.waitForAnyPress();
        Motor.A.forward();
        System.out.println("FORWARD");
        Button.waitForAnyPress();
        Motor.A.backward();
        System.out.println("BACKWARD");
        Button.waitForAnyPress();
        Motor.A.stop();
    }
}
