import java.util.Scanner;
import java.io.*;
import java.util.Random;

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

    public static void largestToSmallest() //come back too
    {
        Scanner input = new Scanner(System.in);
        int num, highest = 51, lowest = 49;

        do 
        {
            System.out.print("Enter a series of integers (enter -99 when you're done): ");
            num = input.nextInt();
        } while(num != -99);
        
        if (num > highest)
        {
            System.out.println(num + " is the highest value");
        }
        else if (num < lowest)
        {
            System.out.println(num + " is the lowest value");
        }
    }

    public static void celsiusToFahrenheit()
    {
        double fahrenheit, celsius;
        final double conversion = 1.8;
        System.out.print("Celsius:\t\tFahrenheit\n");

        for (int i = 0; i < 20; i ++)
        {
            celsius = (i + 1);
            fahrenheit = (conversion * celsius) + 32;
            //System.out.println(celsius + "\t\t\t" + ((conversion * celsius) + 32));
            System.out.printf("%.0f\t\t\t%.2f\n", celsius, ((conversion * celsius) + 32));
        }
    }

    public static void barChart()
    {
        Scanner input = new Scanner(System.in);
        double store1, store2, store3, store4, store5;

        System.out.print("Enter todays sales for store 1: ");
        store1 = input.nextDouble();
        System.out.print("Enter todays sales for store 2: ");
        store2 = input.nextDouble();
        System.out.print("Enter todays sales for store 3: ");
        store3 = input.nextDouble();
        System.out.print("Enter todays sales for store 4: ");
        store4 = input.nextDouble();
        System.out.print("Enter todays sales for store 5: ");
        store5 = input.nextDouble();

        System.out.print("SALES BAR CHART\n");

        store1 /= 100;
        store2 /= 100;
        store3 /= 100;
        store4 /= 100;
        store5 /= 100;

        System.out.print("Store 1: ");

        for (int i = 0; i < store1; i++)
        {
            System.out.print("* ");
        }

        System.out.print("Store 2: ");

        for (int i = 0; i < store2; i++)
        {
            System.out.print("* ");
        }
        
        System.out.print("Store 3: ");

        for (int i = 0; i < store3; i++)
        {
            System.out.print("* ");
        }

        System.out.print("Store 4: ");

        for (int i = 0; i < store4; i++)
        {
            System.out.print("* ");
        }

        System.out.print("Store 5: ");

        for (int i = 0; i < store5; i++)
        {
            System.out.print("* ");
        }
    }

    public static void fileHeadDisplay() throws IOException
    {
        Scanner input = new Scanner(System.in);
        String fileName;
        String names, friends;

        PrintWriter outputFile = new PrintWriter("Names.txt");

        System.out.println("Enter a list of names: ");

        for (int i = 0; i < 5; i++)
        {
            names = input.nextLine();
            outputFile.println(names);
        }

        outputFile.close();

        Scanner inputFile = new Scanner(new File("Names.txt"));

        for (int i = 0; i < 5; i++)
        {
            friends = inputFile.nextLine();
            System.out.println(friends);
        }

        inputFile.close();
    }

    public static void lineNumbers() throws IOException
    {
        String fileName;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of a file: ");
        fileName = input.nextLine();

        Scanner inputFile = new Scanner(new File(fileName));

        for (int i = 0; i < 5; i++)
        {
            String friends = inputFile.nextLine();
            System.out.println((i + 1) + ". " + friends);
        }

        inputFile.close();
    }

    public static void uppercaseFileConverter() throws IOException
    {
        String fileName1, fileName2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of a file you want to open: ");
        fileName1 = input.nextLine();
        System.out.print("Enter the name of a file you want to write to: ");
        fileName2 = input.nextLine();

        Scanner inputFile = new Scanner(new File(fileName1));
        PrintWriter outputFile = new PrintWriter(fileName2);

        for (int i = 0; i < 5; i++)
        {
            String friends = inputFile.nextLine();
            outputFile.println(friends.toUpperCase());
        }

        outputFile.close();
        inputFile.close();
    }

    public static void budgetAnalysis()
    {
        Scanner input = new Scanner(System.in);
        double budget, expenses, totalExpenses = 0;

        System.out.print("How much have you budgeted for the month? ");
        budget = input.nextDouble();
        System.out.println("Enter all of your expenses? (enter 0 when you're done)");

        do 
        {
            expenses = input.nextDouble();
            totalExpenses += expenses;
        } while (expenses != 0);

        if (totalExpenses > budget)
        {
            System.out.printf("You are over budget by $%.2f", totalExpenses - budget);
        }
        else
        {
            System.out.printf("You are over budget by $%.2f", budget - totalExpenses);
        }
    }

    public static void randomNumberGuessingGame()
    {   
        Random randomNumbers = new Random();
        Scanner input = new Scanner(System.in);
        int guess;
        int randomNum = randomNumbers.nextInt(100) + 1;

        System.out.println("Guess the correct number: ");

        do
        {
            guess = input.nextInt();
            if (guess < randomNum)
            {
                System.out.println("Too low, try again.");
            }
            else if (guess > randomNum)
            {
                System.out.println("Too high, try again.");
            }
        } while (randomNum != guess);
    }

    public static void enhancedGuessingGame() 
    {
        Random randomNumbers = new Random();
        Scanner input = new Scanner(System.in);
        int guess, counter = 0;
        int randomNum = randomNumbers.nextInt(100) + 1;

        System.out.println("Guess the correct number: ");

        do
        {
            guess = input.nextInt();
            if (guess < randomNum)
            {
                System.out.println("Too low, try again.");
            }
            else if (guess > randomNum)
            {
                System.out.println("Too high, try again.");
            }

            counter++;
        } while (randomNum != guess);

        System.out.print("It took you " + counter + " times to guess the correct number.");
    }

    public static void ESPGame() //come back too
    {
        Random randomNumbers = new Random();
        Scanner input = new Scanner(System.in);
        int counter = 0;
        String guess;

        for (int i = 0; i < 10; i++)
        {
            int randomNum = randomNumbers.nextInt(4) + 1;

            System.out.print("Enter the color that the computer has selected: ");
            guess = input.nextLine();

            
            counter++;
        }
        
        System.out.print("You guessed correctly " + counter + " times.");
        
    }

    public static void squareDisplay()
    {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 0; i < number; i++)
        {
            for (int j = 0; j < number; j++)
            {
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    public static void diceGame()
    {
        Random randomNumbers = new Random();
        Scanner input = new Scanner(System.in);
        int counterCom = 0, counterUser = 0;

        for (int i = 0; i < 10; i++)
        {
            int randomNumCom = randomNumbers.nextInt(6) + 1;
            int randomNumUser = randomNumbers.nextInt(6) + 1;

            if (randomNumCom > randomNumUser)
            {
                counterCom++;
            }
            else if (randomNumCom < randomNumUser)
            {
                counterUser++;
            }
            else if (randomNumCom == randomNumUser)
            {
                System.out.println("This round is a tie.");
            }
        }

        if (counterCom > counterUser)
        {
            System.out.println("The computer is the grand winner.");
        }
        else if (counterCom < counterUser)
        {
            System.out.println("The user is the grand winner.");
        }
        else if (counterCom == counterUser)
        {
            System.out.println("Its a tie.");
        }
    }

    public static void slotMachine()
    {
        Scanner input = new Scanner(System.in);
        Random randomNumbers = new Random();
        int randomNum;
        String fruit;

        System.out.print("How much amount do you want to enter in the slot machine? ");
        double money = input.nextDouble();

        for (int i = 0; i < 3; i++)
        {
            randomNum = randomNumbers.nextInt(5) + 0;
            
            switch (randomNum)
            {
            case 0: fruit = "cherries";
                    break;
            case 1: fruit = "oranges";
                    break;
            case 2: fruit = "plums";
                    break;
            case 3: fruit = "bells";
                    break;
            case 4: fruit = "melons";
                    break;
            case 5: fruit = "bars";
                    break;
            }
        }
        
    }




    public static void main(String[] args) throws IOException {
        sumOfNumbers();
        System.out.println();
        distanceTravelled();
        System.out.println();
        distanceFile();
        System.out.println();
        penniesForPay();
        System.out.println();
        letterCounter();
        System.out.println();
        fileLetterCounter();
        System.out.println();
        hotelOccupany();
        System.out.println();
        averageRainfall();
        System.out.println();
        population();
        System.out.println();
        largestToSmallest();
        System.out.println();
        celsiusToFahrenheit();
        System.out.println();
        barChart();
        System.out.println();
        fileHeadDisplay();
        System.out.println();
        lineNumbers();
        System.out.println();
        uppercaseFileConverter();
        System.out.println();
        budgetAnalysis();
        System.out.println();
        randomNumberGuessingGame();
        System.out.println();
        enhancedGuessingGame();
        System.out.println();
        ESPGame();
        System.out.println();
        squareDisplay();
        System.out.println();
        diceGame();
        System.out.println();
        slotMachine();
        System.out.println();

    }
}
