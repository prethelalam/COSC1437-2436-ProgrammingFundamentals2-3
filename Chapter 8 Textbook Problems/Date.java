public class Date {
    private Month month = new Month();
    private int day;
    private int year;

    public Date(int monthNum, int dayNum, int yearNum)
    {
        if(monthNum < 1 || monthNum > 12)
        {
            month.setMonthNumber(1);
        }
        else
        {
            month.setMonthNumber(monthNum);
        }
        
        if(monthNum == 1 || monthNum == 3 || monthNum == 5 || monthNum == 8 || monthNum == 10 || monthNum == 12)
        {
            if(dayNum < 1 || dayNum > 31)
            {
                day = 1;
            }
            else
            {
                day = dayNum;
            }
        }
        else if(monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11)
        {
            if(dayNum < 1 || dayNum > 30)
            {
                day = 1;
            }
            else
            {
                day = dayNum;
            }
        }
        else if (monthNum == 2)
        {
            if(dayNum < 1 || dayNum > 28)
            {
                day = 1;
            }
            else
            {
                day = dayNum;
            }
        }
        if(yearNum == 0)
        {
            year = 1;
        }
        else
        {
            year = yearNum;
        }
    }

    public String toString()
    {
        return month.getMonthName() + " " + day + ", " + year;
    }
}
