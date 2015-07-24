package device;
import model.Conditioner;
import model.Environment;

public class ConditionerDevice extends Thread
{
    public Conditioner device;
    public ConditionerDevice(String label, Double minTemp, Double maxTemp, Environment environment)
    {
        device = new Conditioner(label, minTemp, maxTemp, environment);
    }  
    
    @Override
    public void run()
    {
        System.out.println("Cond start!");
        if(device.getCurrentTemp() > device.getMaxTemperature() || device.getCurrentTemp() < device.getMinTemperature())
        {
            device.turnOn();
        }
        else
        {
            device.turnOff();
        }
        
        while(true)
        {
            System.out.println("Current temp = " + device.environment.temp.toString());
            if(device.getCurrentTemp() > device.getMaxTemperature() || device.getCurrentTemp() < device.getMinTemperature())
            {
                device.turnOn();
            }
            else
            {
                device.turnOff();
            }
            
            if(device.checkStatus() == true)
            {
                System.out.println(device.label + ": " + "Conditioner try to " + ((device.environment.temp > device.getMaxTemperature())? "cool.":"heat up."));
                device.environment.temp += ((device.environment.temp < device.getMaxTemperature())? 3 : -3);
            }

                try
                {
                    Thread.sleep(5000);
                }
                catch(Exception e)
                {
                    System.out.println(e.toString());
                }
        }
    }
    
}
