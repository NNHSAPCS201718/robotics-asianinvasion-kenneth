import lejos.nxt.*;
/**
 * Write a description of class LightSensor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LightSensor implements SensorPortListener
{
    
    private SensorPort a;
    public LightSensor( SensorPort b)
    {
        this.value=newval;
        this.a = b;
    }
    
    public void stateChanged(SensorPort aSource,int init, int end)
    {
        SensorPort.S2.addSensorPortListener(this);
        
    }
    
    
    public static void main( String[] args )
    {
        System.out.println("LightSensor");
        Button.waitForAnyPress();
        LightSensor sensor = new LightSensor(
    }
    
}
