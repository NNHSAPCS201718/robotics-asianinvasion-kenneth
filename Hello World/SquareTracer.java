import lejos.robotics.navigation.DifferentialPilot;
import lejos.nxt.*;
public class SquareTracer 
{
    private static DifferentialPilot pilot;
    
    public static void main(String[] args) 
    {
       System.out.println( "SquareTracer" );
       Button.waitForAnyPress();
       pilot = new DifferentialPilot(56, 105, Motor.A, Motor.B);
       for(int i =0; i<4; i++)
       {
           pilot.travel(100);
           pilot.rotateLeft();
           
         }
         
    }
    
}