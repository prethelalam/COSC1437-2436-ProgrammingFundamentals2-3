import java.util.Scanner;
import java.lang.Math;

public class Chp5TextbookProblems {

    // 1.************************************************************
    public static void showChar(String city, int num)
    {
        System.out.print(city.charAt(num));
    }

    //2.************************************************************
    public static double retailPriceCalc(double cost, double markup)
    {
        double retailPrice = cost + (cost * markup);

        return retailPrice;
    }

    //3.************************************************************
    public static double getLength()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a length: ");
        double length = input.nextDouble();

        return length;
    }

    public static double getWidth()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a width: ");
        double width = input.nextDouble();

        return width;
    }

    public static double getArea(double length, double width)
    {
        return length * width;
    }

    public static void displayData(double length, double width, double area)
    {
        System.out.println("The area is " + area);
    }

    //4.************************************************************
    public static double getGallons(double sqaureFeet)
    {
        double gallons = sqaureFeet / 115;

        return gallons;
    }

    public static double getHours(double gallons)
    {
        double hours = gallons * 8;

        return hours;
    }

    public static double getLaborCost(double hours)
    {
        final double rate = 18.00;

        return hours * rate;
    }

    public static double getPaintCost(double gallon, double paintCost)
    {
        return gallon * paintCost;
    }

    public static double getTotalCost(double paintJobCost, double laborCost)
    {
        return paintJobCost + laborCost;
    }

    //5.************************************************************
    public static double fallingDistance(int fallingTime)
    {
        final double gravity = 9.8;

        double distance = ((0.5) * gravity) * (Math.pow(fallingTime, 2));

        return distance;
    }







    public static void main(String[] args) {
        //1.

        // showChar("New York", 2);
        // System.out.println();

        // *************************************************************************
        //2.

        // Scanner input = new Scanner(System.in);
        
        // System.out.print("Enter the wholesale cost of the product: ");
        // double wholeSale = input.nextDouble();
        // System.out.print("Enter the markup percentage: ");
        // double percentMarkUp = input.nextDouble();

        // percentMarkUp /= 100;

        // double retailPrice = retailPriceCalc(wholeSale, percentMarkUp);

        // System.out.printf("Retail price is: $%.2f", retailPrice);

        //*************************************************************************
        //3.

        // double length,    // The rectangle's length
        //      width,     // The rectangle's width
        //      area;      // The rectangle's area

        // // Get the rectangle's length from the user.
        // length = getLength();
    
        // // Get the rectangle's width from the user.
        // width = getWidth();

        // // Get the rectangle's area.
        // area = getArea(length, width);

        // // Display the rectangle data.
        // displayData(length, width, area);

        //*************************************************************************
        //4.
        // Scanner input = new Scanner(System.in);
        // int squareFeet;
        // double totalSquareFeet = 0.0;
        
        // System.out.print("How many rooms do you want to be painted? ");
        // int rooms = input.nextInt();

        // System.out.print("How much is each gallon of paint? ");
        // double paintCost = input.nextDouble();
        
        // for (int i = 0; i < rooms; i++)
        // {
        //     System.out.print("What is the total square feet for room " + (i + 1) + ": ");
        //     squareFeet = input.nextInt();

        //     totalSquareFeet += squareFeet;
        // }

        // double gallonsNeeded = getGallons(totalSquareFeet);
        // double hours = getHours(gallonsNeeded);
        // double paintJobCost = getPaintCost(gallonsNeeded, paintCost);
        // double laborCost = getLaborCost(hours);
        // double totalCost = getTotalCost(paintJobCost, laborCost);

        // System.out.printf("The gallons needed is: %.2f\n", gallonsNeeded);
        // System.out.printf("The hours needed is: %.2f\n", hours);
        // System.out.printf("The cost of paint is: $%.2f\n", paintJobCost);
        // System.out.printf("The cost of labor is: $%.2f\n", laborCost);
        // System.out.printf("The total cost is: $%.2f\n", totalCost);

        //*************************************************************************
        //5.
        int i;
        double distance;

        for (i = 1; i <= 10; i++)
        {
            distance = fallingDistance((i));

            System.out.printf("At " + (i) + " second(s): %.2f meters\n", distance); 
        }
        
    }
}
