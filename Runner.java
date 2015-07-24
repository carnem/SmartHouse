import device.ConditionerDevice;
import device.EnvironmentStatus;
import device.LightDevice;
import mainController.MainController;


public class Runner
{
    public static void main(String[] args)
    {
        EnvironmentStatus environmentStatus = new EnvironmentStatus(new model.Environment(20.0));
        LightDevice light = new LightDevice("Light at home", environmentStatus.environment);
        ConditionerDevice conditioner = new ConditionerDevice("Conditioner at home", 10.0, 30.0, environmentStatus.environment);
        
        MainController controller = new MainController(environmentStatus, conditioner, light);
        
    }   
}
