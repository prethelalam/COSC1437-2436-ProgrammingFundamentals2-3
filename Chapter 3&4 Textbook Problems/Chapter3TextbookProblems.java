import java.util.Scanner;
import java.lang.Math;

public class Chapter3TextbookProblems {

    public static void romanNumerals()
    {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Enter a number between 1 and 10");
        number = input.nextInt();
        
        switch(number)
        {
            case 1: System.out.println("I");
                    break;
            case 2: System.out.println("II");
                    break;
            case 3: System.out.println("III");
                    break;
            case 4: System.out.println("IV");
                    break;
            case 5: System.out.println("V");
                    break;
            case 6: System.out.println("VI");
                    break;
            case 7: System.out.println("VII");
                    break;
            case 8: System.out.println("VIII");
                    break;
            case 9: System.out.println("IX");
                    break;
            case 10: System.out.println("X");
                    break;
            default: System.out.println("Error");
        }
    }

    public static void magicDates()
    {
        Scanner input = new Scanner(System.in);
        int month, day, year, product;

        System.out.print("Enter a month in numeric terms (1-12), a day, and a 2 digit year: ");
        month = input.nextInt();
        day = input.nextInt();
        year = input.nextInt();

        product = month * day;

        if (product == year)
        {
            System.out.println("This date is magic");
        }
        else
        {
            System.out.println("Date is not magic");
        }
    }

    public static void bodyMassIndex()
    {
        Scanner input = new Scanner(System.in);
        double weight, BMI;
        int height;
        final double CONVERSION = 703;

        System.out.print("How much do you weigh (in lbs) and how tall are you (in inches): ");
        weight = input.nextInt();
        height = input.nextInt();

        BMI = (weight*CONVERSION)/(Math.pow(height,2));

        if (BMI < 18.5)
        {
            System.out.println("This person is considered under weight");
        }
        else if (BMI >= 18.5 && BMI <= 25)
        {
            System.out.println("This person is considered optimal weight");
        }
        else 
        {
            System.out.println("This person is considered over weight");
        }
    }

    public static void testScores()
    {
        Scanner input = new Scanner(System.in);
        double test1, test2, test3;
        double average;

        System.out.print("Enter 3 test scores: ");
        test1 = input.nextDouble();
        test2 = input.nextDouble();
        test3 = input.nextDouble();

        average = (test1 + test2 + test3)/3;

        if (average >= 90)
        {
            System.out.printf("Your exam average is %.2f", average);
            System.out.println("%");
            System.out.println("Your letter grade is: A");
        }
        else if (average < 90 && average >= 80)
        {
            System.out.printf("Your exam average is %.2f", average);
            System.out.println("%");
            System.out.println("Your letter grade is: B");
        }
        else if (average < 80 && average >= 70)
        {
            System.out.printf("Your exam average is %.2f", average);
            System.out.println("%");
            System.out.println("Your letter grade is: C");
        }
        else if (average < 70 && average >= 60)
        {
            System.out.printf("Your exam average is %.2f", average);
            System.out.println("%");
            System.out.println("Your letter grade is: D");
        }
        else
        {
            System.out.printf("Your exam average is %.2f", average);
            System.out.println("%");
            System.out.println("Your letter grade is: F");
        }
    }

    public static void massWeight()
    {
        Scanner input = new Scanner(System.in);
        double weight, mass; 
        final double GRAVITY = 9.8;

        System.out.print("Enter an objects mass: ");
        mass = input.nextDouble();

        weight = mass*GRAVITY;

        if (weight > 1000)
        {
            System.out.println("The object is too heavy");
        }
        else if (weight < 10)
        {
            System.out.println("The object is too light");
        }
    }

    public static void timeCalculator()
    {
        Scanner input = new Scanner(System.in);
        int seconds;

        System.out.print("Enter a number of seconds: ");
        seconds = input.nextInt();

        if (seconds >= 60 && seconds < 3600)
        {
            int secondsRemainder = seconds % 60;
            seconds /= 60;
            
            System.out.println(seconds + " minutes and " + secondsRemainder + " seconds");
        }
        else if (seconds >= 3600 && seconds < 86400)
        {
            int secondsRemainder = seconds % 3600;
            seconds /= 3600;
            
            System.out.println(seconds + " hours and " + secondsRemainder + " seconds");
        }
        else if (seconds >= 86400)
        {
            int secondsRemainder = seconds % 86400;
            seconds /= 86400;
            
            System.out.println(seconds + " days and " + secondsRemainder + " seconds");
        }
    }

    public static void sortedNames()
    {
        Scanner input = new Scanner(System.in);
        String name1, name2, name3;

        System.out.println("Enter 3 names: ");
        name1 = input.nextLine();
        name2 = input.nextLine();
        name3 = input.nextLine();

        //look at page 58 in notes
    }

    public static void softwareSales()
    {
        Scanner input = new Scanner(System.in);
        final double PACKAGE_COST = 99.00;
        int quantity;
        double purchaseAmount;

        System.out.print("How many packages did you purchase? ");
        quantity = input.nextInt();

        if (quantity < 10)
        {
            purchaseAmount = (PACKAGE_COST * quantity) - ((PACKAGE_COST * quantity) * 0.30);
            System.out.printf("Purchase amount is $%.2f\n", purchaseAmount);
        }
        else if (quantity >= 10 && quantity < 20)
        {
            purchaseAmount = (PACKAGE_COST * quantity) - ((PACKAGE_COST * quantity) * 0.20);
            System.out.printf("Purchase amount is $%.2f\n", purchaseAmount);
        }
        else if (quantity >= 20 && quantity < 50)
        {
            purchaseAmount = (PACKAGE_COST * quantity) - ((PACKAGE_COST * quantity) * 0.30);
            System.out.printf("Purchase amount is $%.2f\n", purchaseAmount);
        }
        else if (quantity >= 50 && quantity < 100)
        {
            purchaseAmount = (PACKAGE_COST * quantity) - ((PACKAGE_COST * quantity) * 0.40);
            System.out.printf("Purchase amount is $%.2f\n", purchaseAmount);
        }
        else if (quantity >= 100)
        {
            purchaseAmount = (PACKAGE_COST * quantity) - ((PACKAGE_COST * quantity) * 0.50);
            System.out.printf("Purchase amount is $%.2f\n", purchaseAmount);
        }
    }

    public static void shippingCharges()
    {
        Scanner input = new Scanner(System.in);
        int weight;
        final double PRICE_2lb = 1.10, PRICE_2lb_6lb = 2.20, PRICE_6lb_10lb = 3.70, PRICE_10lb = 3.80; //price per 500 miles

        System.out.print("How much does your package weigh in lbs? ");
        weight = input.nextInt();

        if (weight <= 2)
        {
            System.out.printf("The shipping charges is $%.2f\n", PRICE_2lb);
        }
        else if (weight > 2 && weight <= 6)
        {
            System.out.printf("The shipping charges is $%.2f\n", PRICE_2lb_6lb);
        }
        else if (weight > 6 && weight <= 10)
        {
            System.out.printf("The shipping charges is $%.2f\n", PRICE_6lb_10lb);
        }
        else if (weight > 10)
        {
            System.out.printf("The shipping charges is $%.2f\n", PRICE_10lb);
        }
    }

    public static void fatGramCalc()
    {
        Scanner input = new Scanner(System.in);
        int calories, fatGrams;
        double caloriesFromFat;
        final double PERCENT = 0.09;

        System.out.print("How many calories and fat (grams) are in the food item: ");
        calories = input.nextInt();
        fatGrams = input.nextInt();

        caloriesFromFat = fatGrams * PERCENT;
        caloriesFromFat /= calories;
        caloriesFromFat *= 100;

        if (caloriesFromFat > calories)
        {
            System.out.println("Error, input is invalid");
        }
        else if (caloriesFromFat < 30)
        {
            System.out.printf("The percentage of calories that come from fat are %.2f", caloriesFromFat);
            System.out.print("%\n");
            System.out.println("This food item is low in fat.");
        }
        else
        {
            System.out.printf("The percentage of calories that come from fat are %.2f", caloriesFromFat);
            System.out.print("%\n");
            System.out.println("This food item is not low in fat.");
        }
    }

    public static void runningRace()
    {
        Scanner input = new Scanner(System.in);
        double runner1Time, runner2Time, runner3Time;

        System.out.print("What is runner #1 time: ");
        runner1Time = input.nextDouble();
        System.out.print("What is runner #2 time: ");
        runner2Time = input.nextDouble();
        System.out.print("What is runner #3 time: ");
        runner3Time = input.nextDouble();

        if (runner1Time < runner2Time && runner2Time < runner3Time)
        {
            System.out.println("First: Runner 1");
            System.out.println("Second: Runner 2");
            System.out.println("Third: Runner 3");
        }
        else if (runner1Time < runner3Time && runner3Time < runner2Time)
        {
            System.out.println("First: Runner 1");
            System.out.println("Second: Runner 3");
            System.out.println("Third: Runner 2");
        }
        else if (runner2Time < runner1Time && runner1Time < runner3Time)
        {
            System.out.println("First: Runner 2");
            System.out.println("Second: Runner 1");
            System.out.println("Third: Runner 3");
        }
        else if (runner2Time < runner3Time && runner3Time < runner1Time)
        {
            System.out.println("First: Runner 2");
            System.out.println("Second: Runner 3");
            System.out.println("Third: Runner 1");
        }
        else if (runner3Time < runner2Time && runner2Time < runner1Time)
        {
            System.out.println("First: Runner 3");
            System.out.println("Second: Runner 2");
            System.out.println("Third: Runner 1");
        }
        else if (runner3Time < runner1Time && runner1Time < runner2Time)
        {
            System.out.println("First: Runner 3");
            System.out.println("Second: Runner 1");
            System.out.println("Third: Runner 2");
        }
    }

    public static void speedOfSound()
    {
        Scanner input = new Scanner(System.in);
        final int AIR = 1100, WATER = 4900, STEEL = 16400;
        double distance;
        String medium;

        System.out.print("Enter air, water, or steel: ");
        medium = input.nextLine();

        System.out.print("Enter distance travelled: ");
        distance = input.nextDouble();

        if (medium.equalsIgnoreCase("air"))
        {
            double time = distance/AIR;
            System.out.printf("The time it will take for sound to travel through the air is: %.2f seconds", time);
        }
        else if (medium.equalsIgnoreCase("water"))
        {
            double time = distance/WATER;
            System.out.printf("The time it will take for sound to travel through the water is: %.2f seconds", time);
        }
        else if (medium.equalsIgnoreCase("steel"))
        {
            double time = distance/STEEL;
            System.out.printf("The time it will take for sound to travel through the steel is: %.2f seconds", time);
        }
    }

    public static void mobileServiceProvider()
    {
        Scanner input = new Scanner(System.in);
        char option;
        double minutes;

        System.out.print("Which package do you want (a, b, c)? ");
        option = input.next().charAt(0);
        System.out.print("How many minutes will you use: ");
        minutes = input.nextDouble();

        if (option == 'a')
        {
            if(minutes <= 450)
            {
                double cost = 39.99;
                System.out.printf("Your total cost will be $%.2f", cost);
            }
            else
            {
                double cost = 39.99 + (0.45 * (minutes - 450));
                double savingb = cost - 59.99;
                double savingc = cost - 69.99;
                System.out.printf("Your total cost will be $%.2f\n", cost);
                
                if (cost > 59.99 && cost < 69.99)
                {
                    System.out.printf("You would save $%.2f if you got package b", savingb);
                }
                else if (cost > 69.99)
                {
                    System.out.printf("You would save $%.2f if you got package c", savingc);
                }
            }
        }
        else if (option == 'b')
        {
            if(minutes <= 900)
            {
                double cost = 59.99;
                System.out.printf("Your total cost will be $%.2f", cost);
            }
            else
            {
                double cost = 59.99 + (0.40 * (minutes - 900));
                double saving = cost - 69.99;
                System.out.printf("Your total cost will be $%.2f\n", cost);

                if (cost > 69.99)
                {
                    System.out.printf("You would save $%.2f if you got package b", saving);
                }
            }
        }
        else if (option == 'c')
        {
            double cost = 69.99;
            System.out.printf("Your total cost will be $%.2f", cost);
        }
    }

    public static void bankCharges()
    {
        Scanner input = new Scanner(System.in);
        int checksAmt;
        final double discount1 = 0.10, discount2 = 0.08, discount3 = 0.06, discount4 = 0.04;

        System.out.print("How many checks did you write in a month? ");
        checksAmt = input.nextInt();

        if (checksAmt < 20)
        {
            double serviceFees = checksAmt * discount1;
            System.out.printf("Your bank service fees is $%.2f", serviceFees);
        }
        else if (checksAmt >= 20 && checksAmt < 40)
        {
            double serviceFees = checksAmt * discount2;
            System.out.printf("Your bank service fees is $%.2f", serviceFees);
        }
        else if (checksAmt >= 40 && checksAmt < 60)
        {
            double serviceFees = checksAmt * discount3;
            System.out.printf("Your bank service fees is $%.2f", serviceFees);
        }
        else if (checksAmt >= 60)
        {
            double serviceFees = checksAmt * discount4;
            System.out.printf("Your bank service fees is $%.2f", serviceFees);
        }
    }

    public static void bookClubPoints()
    {
        Scanner input = new Scanner(System.in);
        int books;

        System.out.print("How many books did you purchase? ");
        books = input.nextInt();

        if (books == 0)
        {
            System.out.print("You have earned 0 points");
        }
        else if (books == 1)
        {
            System.out.print("You have earned 5 points");
        }
        else if (books == 2)
        {
            System.out.print("You have earned 15 points");
        }
        else if (books == 3)
        {
            System.out.print("You have earned 30 points");
        }
        else if (books >= 4)
        {
            System.out.print("You have earned 60 points");
        }
    }

    public static void wifiDiagnostic()
    {
        Scanner input = new Scanner(System.in);
        String answer;

        System.out.println("I notice you're having wifi connection issues."
                            + " Try rebooting the computer and try to connect. "
                            + "Did that fix the problem? ");
        answer = input.nextLine();

        if (answer.equals("no"))
        {
            System.out.println("\nReboot the router and try to connect. Did that fix the problem? ");
            answer = input.nextLine();

                if (answer.equals("no"))
                {
                    System.out.println("\nMake sure the cables between the router and modem are plugged in firmly. Did that fix the problem? ");
                    answer = input.nextLine();

                        if (answer.equals("no"))
                        {
                            System.out.println("\nMove the router to a new location. Did that fix the problem? ");
                            answer = input.nextLine();

                                if (answer.equals("no"))
                                {
                                    System.out.println("\nGet a new router.");
                                }
                        }
                }
        }
    }

    public static void restaurantSelector()
    {
        Scanner input = new Scanner(System.in);
        String vegetarianAnswer, veganAnswer, glutenAnswer;

        System.out.print("Is anyone in your party a vegetarian? ");
        vegetarianAnswer = input.nextLine();
        System.out.print("\nIs anyone in your party a vegan? ");
        veganAnswer = input.nextLine();
        System.out.print("\nIs anyone in your party gluten-free? ");
        glutenAnswer = input.nextLine();

        if (vegetarianAnswer.equals("no") && veganAnswer.equals("no") && glutenAnswer.equals("no"))
        {
            System.out.print("Here are your restaurant choices:\n");
            System.out.print("\tJoe's Gourmet Burgers\n");
        }
        else if (vegetarianAnswer.equals("yes") && veganAnswer.equals("no") && glutenAnswer.equals("no"))
        {
            System.out.print("Here are your restaurant choices:\n");
            System.out.print("\tMain Street Pizza Company\n");
            System.out.print("\tCorner Cafe\n");
            System.out.print("\tMama's Fine Italian\n");
            System.out.print("\tThe Chef's Kitchen\n");
        }
        else if (vegetarianAnswer.equals("no") && veganAnswer.equals("yes") && glutenAnswer.equals("no") 
                || vegetarianAnswer.equals("yes") && veganAnswer.equals("yes") && glutenAnswer.equals("yes")
                || vegetarianAnswer.equals("no") && veganAnswer.equals("yes") && glutenAnswer.equals("yes")
                || vegetarianAnswer.equals("yes") && veganAnswer.equals("yes") && glutenAnswer.equals("no"))
        {
            System.out.print("Here are your restaurant choices:\n");
            System.out.print("\tCorner Cafe\n");
            System.out.print("\tThe Chef's Kitchen\n");
        }
        else if (vegetarianAnswer.equals("no") && veganAnswer.equals("no") && glutenAnswer.equals("yes")
                || vegetarianAnswer.equals("yes") && veganAnswer.equals("no") && glutenAnswer.equals("yes"))
        {
            System.out.print("Here are your restaurant choices:\n");
            System.out.print("\tMain Street Pizza Company\n");
            System.out.print("\tCorner Cafe\n");
            System.out.print("\tThe Chef's Kitchen\n");
        }
    }

    public static void main(String[] args) {
        romanNumerals();
        System.out.println("");
        magicDates();
        System.out.println("");
        bodyMassIndex();
        System.out.println("");
        testScores();
        System.out.println("");
        massWeight();
        System.out.println("");
        timeCalculator();
        System.out.println("");
        sortedNames();
        System.out.println("");
        softwareSales();
        System.out.println("");
        shippingCharges();
        System.out.println("");
        fatGramCalc();
        System.out.println("");
        runningRace();
        System.out.println("");
        speedOfSound();
        System.out.println("");
        mobileServiceProvider();
        System.out.println("");
        bankCharges();
        System.out.println("");
        bookClubPoints();
        System.out.println("");
        wifiDiagnostic();
        System.out.println("");
        restaurantSelector();
    }
}
