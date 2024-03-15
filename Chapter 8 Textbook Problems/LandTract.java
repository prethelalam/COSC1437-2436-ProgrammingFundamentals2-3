public class LandTract {
    private double length;
    private double width;

    public LandTract(double length1, double width1)
    {
        length = length1;
        width = width1;
    }

    //method that returns tract area
    public double getArea()
    {
        return length * width;
    }

    //equals method
    public boolean equals(double size)
    {
        boolean status = false;

        if(size == getArea())
        {
            status = true;
        }
        else 
        {
            status = false;
        }
        
        return status;
    }

    //toString method
    public String toString()
    {
        return "The area of the tract of land is: " + getArea();
    }
}
