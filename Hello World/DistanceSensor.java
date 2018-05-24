import lejos.nxt.*;
/**
 * Write a description of class DistanceSensor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DistanceSensor
{
    public static void main(String[] args) 
    {
       System.out.println( "DistanceSensor" );
       Button.waitForAnyPress();
       UltrasonicSensor sensor = new UltrasonicSensor(SensorPort.S2);
       System.out.println(sensor.getDistance());
       boolean a = true;
       while (a){
           if(Button.LEFT.isDown())
                {
                    a = false;
                }
           System.out.println(sensor.getDistance());
        }
       Button.waitForAnyPress();
    }
    
}
