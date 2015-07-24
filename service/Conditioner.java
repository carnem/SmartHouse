package service;

public interface Conditioner 
{
    public boolean checkStatus();
    public Double getMinTemperature();
    public Double getMaxTemperature();
    public void turnOn();
    public void turnOff();
}
