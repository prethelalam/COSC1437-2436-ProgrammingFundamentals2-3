public class Freezing_BoilingTemp {
    private double temperature;
    
    public Freezing_BoilingTemp(double temperature)
    {
        setTemperature(temperature);
    }
    
    public void setTemperature(double temperature)
    {
        this.temperature = temperature;
    }

    public double getTemperature()
    {
        return temperature;
    }

    public boolean isEthylFreezing()
    {
        boolean status = false;

        if(temperature <= -173)
        {
            status = true;
        }

        return status;
    }

    public boolean isEthylBoiling()
    {
        boolean status = false;

        if(temperature >= 172)
        {
            status = true;
        }

        return status;
    }

    public boolean isOxygenFreezing()
    {
        boolean status = false;

        if(temperature <= -362)
        {
            status = true;
        }

        return status;
    }

    public boolean isOxygenBoiling()
    {
        boolean status = false;

        if(temperature >= -362)
        {
            status = true;
        }

        return status;
    }

    public boolean isWaterFreezing()
    {
        boolean status = false;

        if(temperature <= 32)
        {
            status = true;
        }

        return status;
    }

    public boolean isWaterBoiling()
    {
        boolean status = false;

        if(temperature >= 212)
        {
            status = true;
        }

        return status;
    }
}
