import lejos.nxt.*;
import lejos.util.*;
/**
 * Write a description of class Motors5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Motors5
{
    public static void main( String[] args )
    {
        System.out.println("Program 5");
        Button.waitForAnyPress();
        Motor.A.setSpeed(720);
        Motor.B.setSpeed(720);
        Motor.C.setSpeed(720);
        
        for (int i = 0; i < 9; i ++){
            Motor.A.rotate(720,true);
            Motor.B.rotate(720,true);
            Motor.C.rotate(720,true);
            while(Motor.A.isMoving()){
                Delay.msDelay(200);
                System.out.println(Motor.A.getTachoCount()+
                ""+Motor.B.getTachoCount()+
                ""+Motor.C.getTachoCount());
            }
        }
        Button.waitForAnyPress();
    }
}
