public class Payroll2 {
    private int[] employeeID = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int[] hours;
    private double[] payRate;
    private double[] wages;

    //constructor
    public Payroll2()
    {
        hours = new int[7];
        payRate = new double[7];
        wages = new double[7];
    }

    //setter
    public void setPayRate(double pay, int index)
    {
        payRate[index] = pay;
    }

    public void setHours(int timeWorked, int index)
    {
        hours[index] = timeWorked;
    }


    //getter
    public double[] getPayRate()
    {
        return payRate;
    }

    public int[] getHours()
    {
        return hours;
    }

    public double[] getWages()
    {
        return wages;
    }

    //methods

    public double calcGrossPay(int index)
    {
        return hours[index] * payRate[index];
    }

    public int displayEmployeeID(int index)
    {
        int employeeNum = employeeID[index];

        return employeeNum;
    }
}
