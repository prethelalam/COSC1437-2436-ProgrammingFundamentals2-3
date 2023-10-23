public class MonthDays {
    private int month;
    private int year;

    public MonthDays(int month, int year)
    {
        setMonth(month);
        setYear(year);
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int numberOfDays()
    {
        int february = 28;

        if (year % 100 == 0)
        {
            if (year % 400 == 0)
            {
                february = 29;
            }
        }
        else if (year % 4 == 0)
        {
            february = 29;
        }

        return february;
    }
}
