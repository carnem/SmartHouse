package model;

public class Environment implements service.Environment
{
    public Double temp;
    public boolean isAnyBodyHere;
    
    public Environment(Double temp)
    {
        this.temp = temp;
        isAnyBodyHere = true;
    }
    
    public Double getTemperature()
    {
        return temp;
    }
}
