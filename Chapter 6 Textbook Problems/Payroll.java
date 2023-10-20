public class Payroll {
    private String name;
    private int ID;
    private double payRate;
    private int hours;

    public Payroll(String name, int ID)
    {
        this.name = name;
        this.ID = ID;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public void setPayRate(double payRate)
    {
        this.payRate = payRate;
    }

    public void setHours(int hours)
    {
        this.hours = hours;
    }

    public double getPayRate()
    {
        return payRate;
    }

    public int getHours()
    {
        return hours;
    }

    public double getGrossPay()
    {
        return payRate * hours;
    }
}
