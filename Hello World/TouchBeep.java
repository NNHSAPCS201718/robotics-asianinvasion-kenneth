import lejos.nxt.*;
/**
 * Write a description of class MAKEABEOOP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TouchBeep
{
    /**
     * nihao
     */
    public static void main( String[] args )
    {
        System.out.println("TouchBeep");
        
        Button.waitForAnyPress();
        TouchSensor touch = new TouchSensor(SensorPort.S3);
        boolean is = true;
        while(is){
        while(!touch.isPressed()){
         
            System.out.println("NOT PRESSED MI AMIGO");
        }
        System.out.println("BEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEP");
        Sound.beep();
        System.out.println("BOEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEZE");
            Sound.buzz();
            if(Button.LEFT.isDown())
            {
                is = false;
            }
        }
        Button.waitForAnyPress();
    }
}
