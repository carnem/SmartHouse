package device;
import model.Light;
import model.Environment;

public class LightDevice extends Thread
{
    Light device;
    Environment environment;
    public LightDevice(String label, Environment environment)
    {
        device = new Light(label);
        this.environment = environment;
    }  
    
    @Override
    public void run()
    {
        System.out.println("Light start!");
        
        if(environment.isAnyBodyHere == true)
        {
            device.turnOn();
        }
        else
        {
            device.turnOff();
        }
        
        while(device.checkStatus() == true)
        {
            if(environment.isAnyBodyHere == true)
            {
                device.turnOn();
            }
            else
            {
                device.turnOff();
            }

            if(device.checkStatus() == true)
            {
                System.out.println(device.label + ": " + "Light shines. ☼");

                try
                {
                    Thread.sleep(2000);
                }
                catch(Exception e)
                {
                    System.out.println(e.toString());
                }
            }
        }
        
    }
}
