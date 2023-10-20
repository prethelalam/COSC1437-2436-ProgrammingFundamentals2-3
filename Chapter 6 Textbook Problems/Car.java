public class Car{
    private int yearModel;
    private String make;
    private int speed;


    public Car(int year, String makeName)
    {
        yearModel = year;
        make = makeName;
        speed = 0;
    }

    //Accessors

    public int getYear()
    {
        return yearModel;
    }

    public String getMake()
    {
        return make;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void accerlerate()
    {
        speed += 5;
    }

    public void brake()
    {
        speed -= 5;
    }
}