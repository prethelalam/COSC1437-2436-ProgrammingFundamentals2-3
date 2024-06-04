public class ProductionWorker extends Employee{
    private int shift;
    private double payRate;

    public ProductionWorker(String name, String number, int date, int shift, double payRate)
    {
        super(name, number, date);
        this.shift = shift;
        this.payRate = payRate;
    }

    public int getShift()
    {
        return shift;
    }

    public double getPay()
    {
        return payRate;
    }
    
    
}
