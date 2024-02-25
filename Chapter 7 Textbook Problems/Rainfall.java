//number 1

import java.util.Scanner;

public class Rainfall {
    private double[] monthlyRain;

    //constructor
    public Rainfall()
    {
        monthlyRain = new double[12];
    }
    
    //setter
    public void setMonthlyRainFall(int month, double rainFall)
    {
        Scanner input = new Scanner(System.in);
        double updateRain;

        if (rainFall >= 0)
        {
            monthlyRain[month - 1] = rainFall;
        }
        else
        {
            do 
            {
                System.out.println("Negative numbers will not be accepted.");
                System.out.print("Enter a positive number for the monthly rainfall: ");
                updateRain = input.nextDouble();

            } while (updateRain <= 0);

            monthlyRain[month - 1] = updateRain;
        }
    }

    //getter
    public double getTotalRainfall()
    {
        double totalRain = 0.0;

        for(int i = 0; i < 12; i++)
        {
            totalRain += monthlyRain[i];
        }

        return totalRain;
    }

    public double getAverageMonthlyRainfall()
    {
        return getTotalRainfall() / 12;
    }

    public double getMostRain()
    {
        double mostRain = monthlyRain[0];
        int i;

        for(i = 1; i < 12; i++)
        {
            if(monthlyRain[i] > mostRain)
            {
                mostRain = monthlyRain[i];
            }
            else
            {
                mostRain = monthlyRain[0];
            }
        }

        return mostRain;
    }

    public double getLeastRain()
    {
        double leastRain = monthlyRain[0];
        int i;

        for(i = 1; i < 12; i++)
        {
            if(monthlyRain[i] < leastRain)
            {
                leastRain = monthlyRain[i];
            }
            else
            {
                leastRain = monthlyRain[0];
            }
        }

        return leastRain;
    }

    public void displayInformation()
    {
        System.out.printf("Total rainfall, in inches, for the year was: %.2f\n", getTotalRainfall());
        System.out.printf("The average monthly rainfall, in inches, for the year was: %.2f\n", getAverageMonthlyRainfall());
        System.out.printf("The month with the most rain is month %.0f\n", getMostRain());
        System.out.printf("The month with the least rain is month %.0f\n", getLeastRain());
    }
}