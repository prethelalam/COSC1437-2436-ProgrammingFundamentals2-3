public class Payroll {
    private String name;
    private int ID;
    private double payRate;
    private int hours;

    public Payroll(String name, int ID)
    {
        if(name == null|| name.isEmpty() || ID < 0)
        {
            throw new IllegalArgumentException("A name or ID has not been entered.");
        }
        else
        {
            this.name = name;
            this.ID = ID;
        }
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public void setPayRate(double payRate) throws InvalidPayRate
    {
        if(payRate < 0 || payRate > 25)
        {
            throw new InvalidPayRate("Pay Rate cannot be less than zero or greater than 25");
        }
        else
        {
            this.payRate = payRate;
        }
    }

    public void setHours(int hours) throws InvalidHours
    {
        if(hours < 0 || hours > 84)
        {
            throw new InvalidHours("Hours cannot exceed 84 or be less than 0");
        }
        else
        {
            this.hours = hours;
        }
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

    public static void displayGrossPay(double grossPay)
    {
        System.out.printf("The employess gross pay is $%.2f", grossPay);
    }
}
