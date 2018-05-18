import lejos.nxt.*;
/**
 * Write a description of class Motors4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Motors4
{
    public static void main( String[] args )
    {
        System.out.println("Program 4");
        Button.waitForAnyPress();
        Motor.A.backward();
        Motor.A.rotate(1440, true); //returns out of method immediately if true, so will allow methods after to run concurrently
        while(Motor.A.isMoving())
        {
            System.out.println(Motor.A.getTachoCount());
            if(Button.readButtons()>0)
            {
                Motor.A.stop();
            }
        }
        System.out.println(Motor.A.getTachoCount());
        Button.waitForAnyPress();
    }
}
