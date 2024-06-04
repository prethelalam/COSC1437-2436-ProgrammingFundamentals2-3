public class TeamLeader extends ProductionWorker {
    private double monthlyBonus; 
    private int requiredHours;
    private int hoursCompleted;

    public TeamLeader(String name, String number, int date, int shift, double payRate, double bonus, int hoursNeeded, int hoursFinished)
    {
        super(name, number, date, shift, payRate);
        monthlyBonus = bonus;
        requiredHours = hoursNeeded;
        hoursCompleted = hoursFinished;
    }

    //getter
    public double getMonthlyBonus()
    {
        return monthlyBonus;
    }

    public int getRequiredHours()
    {
        return requiredHours;
    }

    public int getHoursCompleted()
    {
        return hoursCompleted;
    }
}
