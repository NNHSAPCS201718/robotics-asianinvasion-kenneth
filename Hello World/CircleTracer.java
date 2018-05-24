import lejos.robotics.navigation.DifferentialPilot;
import lejos.nxt.*;
/**
 * Write a description of class CircleTracer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircleTracer
{
    private static DifferentialPilot pilot;
    
    public static void main(String[] args) 
    {
       System.out.println( "CircleTracer" );
       Button.waitForAnyPress();
       pilot = new DifferentialPilot(56, 105, Motor.A, Motor.B);
       pilot.steer(30,360);
       Button.waitForAnyPress();  
       System.out.println("Done");
    }
    
}
