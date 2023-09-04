import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Chapter2TextbookProblems {

    static void nameAgeAnnualIncome()
    {
        String name;
        int age;
        double annualPay;
        Scanner input = new Scanner(System.in);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        System.out.print("What is your name: ");
        name = input.nextLine();

        System.out.print("What is your age? ");
        age = input.nextInt();

        System.out.print("What is your annual pay? ");
        annualPay = input.nextDouble();

        System.out.print("My name is " + name + ", my age is " + age
                        + " and I hope to earn " 
                        + currencyFormat.format(annualPay) + " per year.");
    }

    static void nameInitials()
    {
        String firstName = "Prethel", lastName = "Alam";
        char firstIntitial = 'P', lastInitial = 'A';

        System.out.print(firstName + " " + lastName + "\n");
        System.out.print(firstIntitial + "" + lastInitial);
    }

    static void personalInformation()
    {
        System.out.println("Prethel Alam\n" + "1234 Road Dr. Dallas, TX 12345\n"
                            + "123-456-7891\n" + "Computer Science\n");
    }

    static void starPattern()
    {
        System.out.println(" *");
        System.out.println(" ***");
        System.out.println(" *****");
        System.out.println("*******");
        System.out.println(" *****");
        System.out.println(" ***");
        System.out.println(" *");
    }

    static void salesPrediction()
    {
        final double PERCENT = 0.62; 
        final int SALES = 4600000;
        double eastCoastSales;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        eastCoastSales = SALES * PERCENT;

        System.out.println("East coast sales division earn: " 
                            + currencyFormat.format(eastCoastSales));
    }

    static void landCalculation()
    {
        final double ACRE_OF_LAND = 43560, NUMBER_ACRES = 389767;
        double acres;
        DecimalFormat patternFormat = new DecimalFormat("#,###.00");

        acres = NUMBER_ACRES/ACRE_OF_LAND;

        System.out.print("Numbers of acres in a tract of land: " 
                        + patternFormat.format(acres) + " acres");
    }

    static void salesTax()
    {
        final double STATE_TAX = 0.04, COUNTY_TAX = 0.02;
        double purchaseAmount, totalTax, stateTaxAmount, countyTaxAmount, totalSale;
        Scanner input = new Scanner(System.in);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        System.out.print("Enter the amount of your purchase ");
        purchaseAmount = input.nextDouble();

        countyTaxAmount = purchaseAmount * COUNTY_TAX;
        stateTaxAmount = purchaseAmount * STATE_TAX;
        totalTax = countyTaxAmount + stateTaxAmount;
        totalSale = purchaseAmount + totalTax;

        System.out.println("Purchase amount: " + currencyFormat.format(purchaseAmount));
        System.out.println("County tax amount: " + currencyFormat.format(countyTaxAmount));
        System.out.println("State tax amount: " + currencyFormat.format(stateTaxAmount));
        System.out.println("Total tax amount: " + currencyFormat.format(totalTax));
        System.out.println("Total sale amount: " + currencyFormat.format(totalSale));
    }

    static void cookieCalories()
    {
        Scanner input = new Scanner(System.in);
        int cookies, calories; 
        final int CALORIES_PER_COOKIE = 75;

        System.out.print("How many cookies did you eat? ");
        cookies = input.nextInt();

        calories = cookies * CALORIES_PER_COOKIE;

        System.out.println("You consumed " + calories + " calories");
    }

    static void milesPerGallon()
    {
        Scanner input = new Scanner(System.in);
        double milesDriven, gallons, MPG;
        DecimalFormat patternFormat = new DecimalFormat("#,###.00");

        System.out.print("How many miles did you drive? ");
        milesDriven = input.nextDouble();

        System.out.print("How many gallons of gas did you use? ");
        gallons = input.nextDouble();

        MPG = milesDriven/gallons;

        System.out.print("Your cars miles per gallon was " + patternFormat.format(MPG));
    }

    static void testAverage()
    {
        Scanner input = new Scanner(System.in);
        double test1, test2, test3;
        double average;
        DecimalFormat patternFormat = new DecimalFormat("#,###.00");

        System.out.print("Enter 3 test scores: ");
        test1 = input.nextDouble();
        test2 = input.nextDouble();
        test3 = input.nextDouble();

        average = (test1 + test2 + test3) / 3;

        System.out.print("Test average is " + patternFormat.format(average));
    }

    static void circuitBoardProfit()
    {
        final double PROFIT_PERCENT = 0.40;
        double retailPrice, profit;
        Scanner input = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.print("What is the retail price of a circuit board? ");
        retailPrice = input.nextDouble();

        profit = retailPrice * PROFIT_PERCENT;

        System.out.print("Profit earned: " + formatter.format(profit));
    }

    static void stringManipulator()
    {
        Scanner input = new Scanner(System.in);
        String city;

        System.out.print("Enter your favorite city: ");
        city = input.nextLine();

        System.out.println(city.length());
        System.out.println(city.toUpperCase());
        System.out.println(city.toLowerCase());
        System.out.println(city.charAt(0));
    }

    static void restaurantBill()
    {
        double bill, taxAmount, tipAmount, totalBill;
        final double tax = 0.0675, tip = 0.20;
        Scanner input = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.print("How much was your bill? ");
        bill = input.nextDouble();

        taxAmount = bill * tax;
        tipAmount = (bill + taxAmount) * tip;
        totalBill = bill + taxAmount + tipAmount;

        System.out.println("Meal charge: " + formatter.format(bill));
        System.out.println("Tax amount: " + formatter.format(taxAmount));
        System.out.println("Tip amount: " + formatter.format(tipAmount));
        System.out.println("Total bill: " + formatter.format(totalBill));
    }

    static void maleFemalePercentage()
    {
        Scanner input = new Scanner(System.in);
        int maleStudents, femaleStudents;
        double totalStudents, malePercent, femalePercent;
        DecimalFormat patternFormat = new DecimalFormat("#,###.00");

        System.out.print("How many men and female are registered in a class: ");
        maleStudents = input.nextInt();
        femaleStudents = input.nextInt();

        totalStudents = maleStudents + femaleStudents;
        malePercent = (maleStudents / totalStudents) * 100;
        femalePercent = (femaleStudents / totalStudents) * 100;

        System.out.println("Male percentage in class " + patternFormat.format(malePercent));
        System.out.println("Female percentage in class " + patternFormat.format(femalePercent));
    }

    static void stockCommission()
    {
        final int SHARES = 600;
        final double PRICE_PER_SHARE = 21.77, PERCENT_COMMISSION = 0.02;
        double stockCost, commission, totalPayment;
        Scanner input = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        stockCost = SHARES * PRICE_PER_SHARE;
        commission = stockCost * PERCENT_COMMISSION;
        totalPayment = stockCost + commission;

        System.out.println("Stock cost: " + formatter.format(stockCost));
        System.out.println("Commission paid: " + formatter.format(commission));
        System.out.println("Total amount paid: " + formatter.format(totalPayment));
    }

    static void energyDrinkConsumption()
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat patternFormat = new DecimalFormat("#,###.00");
        final int CUSTOMERS = 12467;
        final double ONE_DRINK_WEEK = 0.14, CITRUS = 0.64;
        double drinkAWeek, citrusPercent;

        drinkAWeek = CUSTOMERS * ONE_DRINK_WEEK;
        citrusPercent = drinkAWeek * CITRUS; 

        System.out.println("Number of customers who purchase one or more energy drinks per week " 
                            + patternFormat.format(drinkAWeek));
        System.out.println("Number of customers who prefer citrus flavored energy drinks " 
                            + patternFormat.format(citrusPercent));
    }

    static void ingredientAdjustor()
    {
        Scanner input = new Scanner(System.in);
        double cupsOfSugar = 1.5, cupsOfButter = 1.0, cupsOfFlour = 2.75;
        int cookies;
        DecimalFormat patternFormat = new DecimalFormat("#,##0.00");

        cupsOfSugar /= 48;
        cupsOfButter /= 48;
        cupsOfFlour /= 48;

        System.out.print("How many cookies do you want to make? ");
        cookies = input.nextInt();

        cupsOfSugar *= cookies;
        cupsOfButter *= cookies;
        cupsOfFlour *= cookies;

        System.out.println("To make " + cookies + " cookies, you need:\n" 
                            + patternFormat.format(cupsOfSugar) + " cups of sugar\n"
                            + patternFormat.format(cupsOfButter) + " cups of butter\n"
                            + patternFormat.format(cupsOfFlour) + " cups of flour");
    }

    static void wordGame()
    {
        Scanner input = new Scanner(System.in);
        String name, city, college, profession, animal, petName;
        int age;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();
        input.nextLine();

        System.out.print("Enter your college: ");
        college = input.nextLine();

        System.out.print("Enter your city: ");
        city = input.nextLine();

        System.out.print("Enter your profession: ");
        profession = input.nextLine();

        System.out.print("Enter a animal: ");
        animal = input.nextLine();

        System.out.print("Enter a pet name: ");
        petName = input.nextLine();

        System.out.print("There once was a person named " + name + " who lived in " 
                        + city + ". At the age of " + age + ", " + name +
                        " went to college at " + college + ". " + name +
                        " graduated and went to work as a " + profession + 
                        ". Then, " + name + " adopted a " + animal + " named " +
                        petName + ". They both lived happily ever after!");
    }

    static void stockTransactionProgram()
    {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        final int SHARES = 1000;
        final double STOCK_COST = 32.87, COMMISSION1 = 0.02, STOCK_SOLD = 33.92;
        double totalStockCost, commissionPaid1, totalStockSold, commissionPaid2;

        totalStockCost = SHARES * STOCK_COST;
        commissionPaid1 = totalStockCost * COMMISSION1;
        totalStockSold = SHARES * STOCK_SOLD;
        commissionPaid2 = totalStockSold * COMMISSION1;

        System.out.println("Amount paid for stock: " + formatter.format(totalStockCost));
        System.out.println("Amount paid for commission when stock was bought: " + formatter.format(commissionPaid1));
        System.out.println("Amount paid for stock sold: " + formatter.format(totalStockSold));
        System.out.println("Amount paid for commission when stock was sold: " + formatter.format(commissionPaid2));
    }

    static void plantingGrapevines()
    {
        Scanner input = new Scanner(System.in);
        double grapevines, length, endPostAssembly, spaceVines;

        System.out.print("Enter the length of the row, in feet: ");
        length = input.nextInt();
        System.out.print("Enter the amount of space used by an end-post assembly, in feet: ");
        endPostAssembly = input.nextInt();
        System.out.print("Enter the amount of space used between vines, in feet: ");
        spaceVines = input.nextInt();

        grapevines = (length - (2 * endPostAssembly)) / spaceVines;

        System.out.println(grapevines + " grapevines will fit in the row");
    }

    static void compoundInterest()
    {
        Scanner input = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        double principal, interestRate, compounded, years, moneyAccumulated;

        System.out.print("Enter the amount of prinicpal orginally depositied: ");
        principal = input.nextDouble();
        System.out.print("Enter the annual interest rate paid by the account: ");
        interestRate = input.nextDouble();
        System.out.print("Enter the number of times per year that the interest is compounded: ");
        compounded = input.nextDouble();
        System.out.print("Enter the number of years the account will be left to earn interest: ");
        years = input.nextDouble();

        moneyAccumulated = principal * Math.pow(1 + (interestRate/compounded), (compounded * years)); 

        System.out.println(formatter.format(moneyAccumulated) + " will be in the account after " + years + " years");
    }

    public static void main(String[] args)
    {
        //number1
        nameAgeAnnualIncome();
        System.out.println();

        //number2
        nameInitials();
        System.out.println();

        //number3
        personalInformation();
        System.out.println();

        //number4
        starPattern();
        System.out.println();

        //number5
        salesPrediction();
        System.out.println();

        //number6
        landCalculation();
        System.out.println();

        //number7
        salesTax();
        System.out.println();

        //number8
        cookieCalories();
        System.out.println();

        //number9
        milesPerGallon();
        System.out.println();

        //number10
        testAverage();
        System.out.println();

        //number11
        circuitBoardProfit();
        System.out.println();

        //number12
        stringManipulator();
        System.out.println();

        //number13
        restaurantBill();
        System.out.println();

        //number14
        maleFemalePercentage();
        System.out.println();

        //number15
        stockCommission();
        System.out.println();

        //number16
        energyDrinkConsumption();
        System.out.println();
        
        //number17
        ingredientAdjustor();
        System.out.println();

        //number18
        wordGame();
        System.out.println();

        //number19
        stockTransactionProgram();
        System.out.println();

        //number20
        plantingGrapevines();
        System.out.println();

        //number21
        compoundInterest();
        System.out.println();
    }
}