public class ShiftSupervisor extends Employee {
    private double annualSalary;
    private double annualBonus;


    public ShiftSupervisor(double salary, double bonus, String name, String number, int date)
    {
        super(name, number, date);
        setSalary(salary);
        setBonus(bonus);
    }

    //setters
    public void setSalary(double salary)
    {
        annualSalary = salary;
    }

    public void setBonus (double bonus)
    {
        annualBonus = bonus;
    }

    //getters
    public double getSalary()
    {
        return annualSalary;
    }

    public double getBonus()
    {
        return annualBonus;
    }
}
