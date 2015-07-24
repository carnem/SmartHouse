package device;
import model.Environment;
import java.util.Random;

public class EnvironmentStatus extends Thread
{
    public Environment environment;
    Random rand;
    
    public EnvironmentStatus(Environment environment)
    {
        this.environment = environment;
        rand = new Random(System.currentTimeMillis());
    }
    
    @Override
    public void run()
    {
        System.out.println("Env start!");
        while(true)
        {
            environment.temp += 1;
            try
            {
                Thread.sleep(7000);
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
    }
}
