public class Month {
    private int monthNumber;

    public Month()  //no-arg constructor
    {
        monthNumber = 1;
    }

    public Month(int numMonths)
    {
        if (numMonths < 1 || numMonths > 12)
        {
            monthNumber = 1;
        }
        else
        {
            monthNumber = numMonths;
        }
    }

    public Month(String monthName)
    {
        switch(monthName)
        {
            case "january": monthNumber = 1;
                            break;
            case "febuary": monthNumber = 2;
                            break;
            case "march": monthNumber = 3;
                            break;
            case "april": monthNumber = 4;
                            break;
            case "may": monthNumber = 5;
                            break;
            case "june": monthNumber = 6;
                            break;
            case "july": monthNumber = 7;
                            break;
            case "august": monthNumber = 8;
                            break;
            case "september": monthNumber = 9;
                            break;
            case "october": monthNumber = 10;
                            break;
            case "november": monthNumber = 11;
                            break;
            case "december": monthNumber = 12;
                            break;
        }
    }

    public void setMonthNumber(int monthNum)
    {
        if (monthNum < 1 || monthNum > 12)
        {
            monthNumber = 1;
        }
        else
        {
            monthNumber = monthNum;
        }
    }

    public int getMonthNumber()
    {
        return monthNumber;
    }

    public String getMonthName()
    {
        String monthName = "";

        switch(monthNumber)
        {
            case 1: monthName = "january";
                            break;
            case 2: monthName = "febuary";
                            break;
            case 3: monthName = "march";
                            break;
            case 4: monthName = "april";
                            break;
            case 5: monthName = "may";
                            break;
            case 6: monthName = "june";
                            break;
            case 7: monthName = "july";
                            break;
            case 8: monthName = "august";
                            break;
            case 9: monthName = "september";
                            break;
            case 10: monthName = "october";
                            break;
            case 11: monthName = "november";
                            break;
            case 12: monthName = "december";
                            break;
        }

        return monthName;
    }

    public String toString()
    { 
        return getMonthName();
    }

    public boolean equals(Month otherMonth)
    {
        boolean status = false;

        if (monthNumber == otherMonth.getMonthNumber())
        {
            status = true;
        }
        else
        {
            status = false;
        }

        return status;
    }

    public boolean greaterThan(Month otherMonth)
    {
        boolean status = false;

        if (monthNumber > otherMonth.getMonthNumber())
        {
            status = true;
        }
        else
        {
            status = false;
        }

        return status;
    }

    public boolean lessThan(Month otherMonth)
    {
        boolean status = false;

        if (monthNumber < otherMonth.getMonthNumber())
        {
            status = true;
        }
        else
        {
            status = false;
        }

        return status;
    }
}
