import lejos.nxt.*;
import lejos.util.Delay;
/**
 * Write a description of class Motors2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Motors2
{
    public static void main( String[] args )
    {
        System.out.println( "Program 2" );
        Button.waitForAnyPress();
        Motor.A.setSpeed(200);
        Motor.A.forward();
        Delay.msDelay(2000);
        System.out.println("Printing out tacho count");
        System.out.println(Motor.A.getTachoCount());//398
        Motor.A.stop();
        System.out.println(Motor.A.getTachoCount());//400
        Motor.A.backward();
        
        while(Motor.A.getTachoCount()!=0)
        {
            System.out.println(Motor.A.getTachoCount());
            
        }
        System.out.println("Tacho Count == 0");
        System.out.println(Motor.A.getTachoCount());
        Motor.A.stop();
        System.out.println(Motor.A.getTachoCount());
        Button.waitForAnyPress();
        System.out.println("End of program");
        Button.waitForAnyPress();
        
    }
}
