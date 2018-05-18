import lejos.nxt.*;
/**
 * Write a description of class Motors3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Motors3
{
    public static void main( String[] args )
    {
        System.out.println("Program 3");
        Button.waitForAnyPress();
        Motor.A.rotate(1440);
        System.out.println(Motor.A.getTachoCount());
        Motor.A.rotateTo(0);
        System.out.println(Motor.A.getTachoCount());
        Button.waitForAnyPress();
    }
}
