import java.util.Scanner;
import java.io.*;
import java.lang.Math;

public class Chapter4TextbookProblems {
    
    public static void sumOfNumbers()
    {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter positive nonzero number: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++)
        {
            sum += i;
        }
        System.out.println("The sum of all the numbers is " + sum);
    }

    public static void distanceTravelled()
    {
        Scanner input = new Scanner(System.in);
        int speed, hours, distance;

        do 
        {
            System.out.print("Enter the speed of your vehicle and how many hours it has travelled: ");
            speed = input.nextInt();
            hours = input.nextInt();
        }
        while (speed <= 0 || hours <= 1);
        
        System.out.print("Hour\tDistance Travelled\n");
        System.out.println("-----------------------------");

        for (int i = 1; i <= hours; i++)
        {
            distance = speed * i;
            System.out.printf("%-8d%-8d\n", i, distance);
        }
    }

    public static void distanceFile() throws IOException
    {
        Scanner input = new Scanner(System.in);
        int speed, hours, distance;

        do 
        {
            System.out.print("Enter the speed of your vehicle and how many hours it has travelled: ");
            speed = input.nextInt();
            hours = input.nextInt();
        }
        while (speed <= 0 || hours <= 1);

        PrintWriter outputFile = new PrintWriter("Distance.txt");
        System.out.println("File is now open to be written into.");
        outputFile.println("Hour\tDistance Travelled");
        outputFile.println("-----------------------------");

        for (int i = 1; i <= hours; i++)
        {
            distance = speed * i;
            outputFile.printf("%-8d%-8d\n", i, distance);
        }

        outputFile.close();
        System.out.println("Data has been written to the file.");
    }

    public static void penniesForPay()
    {
        Scanner input = new Scanner(System.in);
        int days, pennyTotal = 0;

        do
        {
            System.out.print("Enter a number of days: ");
            days = input.nextInt();
        }
        while (days < 1);

        for (int i = 1; i <= days; i++)
        {
            pennyTotal += i; //fix this
        }

        System.out.print("The total amount of pennies you would have after " + days 
                        + " days is " + pennyTotal);
    }











    public static void main(String[] args) throws IOException {
        //sumOfNumbers();
        //System.out.println();
        //distanceTravelled();
        //System.out.println();
        //distanceFile();
        //System.out.println();
        penniesForPay();
    }
}
