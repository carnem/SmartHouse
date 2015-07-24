package model;

public class Light implements service.Light
{
    public String label; 
    private boolean status;
     
    public Light(String label)
    {
        this.label = label;
        this.status = false;
    }  
    
    @Override
    public boolean checkStatus()
    {
        return status;
    }
    @Override
    public void turnOn()
    {
        if(status == false)
            status = true;
    }
    @Override
    public void turnOff()
    {
        if(status == true)
            status = false;
    }
}
