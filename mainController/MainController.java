package mainController;
import device.ConditionerDevice;
import device.EnvironmentStatus;
import device.LightDevice;

public class MainController
{
    static EnvironmentStatus environment;
    static ConditionerDevice conditioner;
    static LightDevice light;
    
    public MainController(EnvironmentStatus environment, ConditionerDevice conditioner, LightDevice light)
    {
        this.environment = environment;
        this.conditioner = conditioner;
        this.light = light;
        
        Thread envThread = new Thread(this.environment);
        envThread.start();
        
        Thread condThread = new Thread(this.conditioner);
        condThread.start();
        
        Thread lightThread = new Thread(this.light);
        lightThread.start();          
    }
    
    public void somebodyCameHere()
    {
        environment.environment.isAnyBodyHere = true;
    }
    public void somebodyLeftHere()
    {
        environment.environment.isAnyBodyHere = false;
    }
    
    public void turnOnConditioner()
    {
        if(conditioner.getState() !=  Thread.State.TERMINATED)
            ;
    }    
    public void turnOffConditioner()
    {
        if(conditioner.getState() !=  Thread.State.RUNNABLE)
            ;
    }
    
    public void turnOnLight()
    {
        if(light.getState() !=  Thread.State.TERMINATED)
            ;
    }    
    public void turnOffLight()
    {
        if(light.getState() !=  Thread.State.RUNNABLE)
            ;
    }
    
}
