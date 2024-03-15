public class Area {
    // 3 overloaded static methods 

    public static double getArea(double radius)      // this will calculate the area of a circle
    {
        return (Math.PI)*(Math.pow(radius, 2));
    }

    public static double getArea(double length, double width) //this will calculate the area of a rectangle
    {
        return length * width;
    }   

    public static double getArea(double length1, double length2, double height)     //this will calculate the area of a trapezoid
    {
        return (length1 + length2) * (height/2.0);
    }
}
