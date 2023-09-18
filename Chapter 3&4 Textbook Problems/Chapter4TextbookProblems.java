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
        int days, pennyTotal = 0, totalDays = 1, pennies = 2;

        do
        {
            System.out.print("Enter a number of days: ");
            days = input.nextInt();
        }
        while (days < 1);

        while (totalDays <= days)
        {
            pennyTotal = pennies;
            pennies *= 2;
            totalDays++;
        }

        System.out.print("The total amount of pennies you would have after " + days 
                        + " days is " + pennyTotal);
    }

    public static void letterCounter()
    {
        Scanner input = new Scanner(System.in);
        int counter = 0;

        System.out.print("Enter a word: ");
        String response = input.nextLine();

        System.out.print("Enter a letter: ");
        char choice = input.next().charAt(0);

        for (int i = 0; i < response.length(); i++)
        {
            if (response.charAt(i) == choice)
            {
                counter++;
            }
        }
        System.out.println("The letter " + choice + " is in the word " + response + " " + counter + " times.");
    }

    public static void fileLetterCounter()
    {
        Scanner input = new Scanner(System.in);
        String fileName;
        int counter = 0;

        System.out.print("Enter a name for a file (follow the name with .txt): ");
        fileName = input.nextLine();

        System.out.print("Enter a letter: ");
        char choice = input.next().charAt(0);

        File myFile = new File(fileName);

        for (int i = 0; i < fileName.length(); i++)
        {
            if (fileName.charAt(i) == choice)
            {
                counter++;
            }
        }
        System.out.println("The letter " + choice + " is in the word " + fileName + " " + counter + " times.");
    }

    public static void hotelOccupany()
    {
        Scanner input = new Scanner(System.in);
        double rooms, occupiedRooms, totalRooms = 0, totalOccupiedRooms = 0, floors;

        do 
        {
            System.out.print("How many floors are in the hotel? ");
            floors = input.nextDouble();
        } while (floors < 1);
        

        for (int i = 0; i < floors; i++)
        {
            do 
            {
                System.out.print("On floor " + (i + 1) + " how many rooms are there in total and how many of them are occupied? ");
                rooms = input.nextDouble();
                occupiedRooms = input.nextDouble();
            } while (rooms < 10);
            
            totalRooms += rooms;
            totalOccupiedRooms += occupiedRooms;
        }

        System.out.printf("Total number of rooms: %.0f\n", totalRooms);
        System.out.printf("Total number of rooms occupied: %.0f\n", totalOccupiedRooms);
        System.out.printf("Total number of rooms vacant: %.0f\n", (totalRooms - totalOccupiedRooms));
        System.out.printf("Hotel Vacancy rate: %.2f\n", (totalOccupiedRooms / totalRooms));
    }

    public static void averageRainfall()
    {
        Scanner input = new Scanner(System.in);
        int years;
        double rainfall, totalRainfall = 0;

        do 
        {
            System.out.print("Enter a number of years: ");
            years = input.nextInt();
        } while (years < 1);
        
        for (int i = 0; i < years; i++)
        {
            for (int j = 0; j < 12; j++)
            {
                do 
                {
                    System.out.print("How many inches of rainfall occured in month " + (j + 1) + "? ");
                    rainfall = input.nextDouble();
                } while (rainfall < 0);

                totalRainfall += rainfall;
            }
        }
        System.out.println("Total number of months: " + (years * 12));
        System.out.println("Total rainfall: " + totalRainfall);
        System.out.printf("Average rainfall per month is %.2f", (totalRainfall / (years * 12)));
    }

    public static void population()
    {
        Scanner input = new Scanner(System.in);
        int days;
        double popInc, organisms;

        do 
        {
            System.out.print("Enter the starting number of organisms: ");
            organisms = input.nextDouble();
            System.out.print("Enter the average daily population increase as a percentage in decimal format: ");
            popInc = input.nextDouble();
            System.out.print("How many days will the population multiply for? ");
            days = input.nextInt();
        } while (organisms < 2 || popInc < 0 || days < 1);

        for (int i = 0; i < days; i++)
        {
            organisms += (organisms * popInc);
            System.out.print("Day: " + (i + 1) + "\tpopulation: " + organisms + "\n");
        }
    }

    public static void largestToSmallest()
    {
        
    }









    public static void main(String[] args) throws IOException {
        //sumOfNumbers();
        //System.out.println();
        //distanceTravelled();
        //System.out.println();
        //distanceFile();
        //System.out.println();
        //penniesForPay();
        //System.out.println();
        //letterCounter();
        //System.out.println();
        //fileLetterCounter();
        //System.out.println();
        //hotelOccupany();
        //System.out.println();
        //averageRainfall();
        //System.out.println();
        //population();
        //System.out.println();
        largestToSmallest();
    }
}
