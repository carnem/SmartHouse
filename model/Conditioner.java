package model;

public class Conditioner implements service.Conditioner
{
    private boolean status;
    public String label;
    private Double minTemp;
    private Double maxTemp;
    public Environment environment;
    
    public Conditioner(String label, Double minTemp, Double maxTemp, Environment environment)
    {
        this.label = label;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.environment = environment;
        this.status = false;
    }
    
    @Override
    public boolean checkStatus()
    {
        return status;
    }
    @Override
    public Double getMinTemperature()
    {
        return minTemp;
    }
    @Override
    public Double getMaxTemperature()
    {
        return maxTemp;
    }
    public Double getCurrentTemp()
    {
        return environment.temp;
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
