import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Chapter6TextbookProblems {
    public static void main(String[] args) throws IOException {

    //number 1

        // Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        // Employee employee2 = new Employee("Mark Jones", 39119, "IT", "\tProgrammer");
        // Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        // System.out.println("Name:\t\tID Number\t\tDepartment\t\tPosition");
        // System.out.println("-------------------------------------------------------------------------------");
        // displayEmployeeInformation(employee1);
        // displayEmployeeInformation(employee2);
        // displayEmployeeInformation(employee3);

    //*************************************************************************************************************

    //number 2

        // Car car1 = new Car(2020, "Toyota Corolla");
        // displaySpeedInc(car1);
        // System.out.println();
        // displaySpeedDec(car1);
        
    //*************************************************************************************************************

    //number 3
        
        // PersonalData person1 = new PersonalData("Prethel Alam", "1234 MarryGold Way", 24, 1234567891);
        // PersonalData person2 = new PersonalData("Zeus Alam", "1234 MarryGold Way", 5, 1565678906);
        // PersonalData person3 = new PersonalData("Simba Alam", "1234 MarryGold Way", 5, 1345672345);

        // displayInformation(person1);
        // System.out.println();
        // displayInformation(person2);
        // System.out.println();
        // displayInformation(person3);
        // System.out.println();

    //*************************************************************************************************************

    //number 4

        // RetailItem item1 = new RetailItem("Jacket\t", 12, 59.99);
        // RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
        // RetailItem item3 = new RetailItem("Shirt\t", 20, 24.95);

        // System.out.println("\t\tDescription:\t\tUnits on Hand\t\tPrice");
        // System.out.println("----------------------------------------------------------------------");
        // System.out.print("Item #1");
        // displayClothingInfo(item1);
        // System.out.print("Item #2");
        // displayClothingInfo(item2);
        // System.out.print("Item #3");
        // displayClothingInfo(item3);

    //*************************************************************************************************************

    //number 5
    
        // Scanner input = new Scanner(System.in);

        // System.out.print("Enter the name of an employee: ");
        // String name = input.nextLine();
        // System.out.print("Enter the employees ID number: ");
        // int IDNum = input.nextInt();
        // System.out.print("Enter the employees pay rate: ");
        // double pay = input.nextDouble();
        // System.out.print("Enter the amount of hours the employee has worked: ");
        // int hours = input.nextInt();

        // Payroll employee = new Payroll(name, IDNum);
        // employee.setPayRate(pay); //have to individually set since constructor doesnt have those parameters
        // employee.setHours(hours);

        // double grossPay = employee.getGrossPay();

        // displayGrossPay(grossPay);

    //*************************************************************************************************************

    //number 6

        // Scanner input = new Scanner(System.in);

        // System.out.print("Enter your first test score 1: ");
        // double test1 = input.nextDouble();
        // System.out.print("Enter your first test score 2: ");
        // double test2 = input.nextDouble();
        // System.out.print("Enter your first test score 3: ");
        // double test3 = input.nextDouble(); 

        // TestScores examGrade = new TestScores(test1, test2, test3);

        // System.out.printf("Your exam average is %.2f", examGrade.getAverage());

    //*************************************************************************************************************

    //number 7

        // Scanner input = new Scanner(System.in);

        // System.out.print("What is the circles radius? ");
        // double radius = input.nextDouble();

        // Circle circleData = new Circle(radius);

        // displayCircleInformation(circleData);

    //*************************************************************************************************************

    //number 8

        // Scanner input = new Scanner(System.in);

        // System.out.print("What is the temperature in fahrenheit? ");
        // double temp = input.nextDouble();

        // Temperature fahrenheit = new Temperature(temp);

        // displayCelsius(fahrenheit);
        // displayKelvin(fahrenheit);

    //*************************************************************************************************************

    //number 9

        // Scanner input = new Scanner(System.in);
        // int daysInMonth;

        // System.out.print("Pick a month (1 - 12): ");
        // int month = input.nextInt();
        // System.out.print("Pick a year: ");
        // int year = input.nextInt();

        // MonthDays days = new MonthDays(month, year);

        // int numDays = getDaysInMonth(days, month, year);

        // displayDays(numDays, month, year);

    //*************************************************************************************************************

    //number 10

        //come back to this since it will take a while to code

    //*************************************************************************************************************

    //number 11

        // Scanner input = new Scanner(System.in);

        // System.out.println("Enter a temperature: ");
        // double temperature = input.nextDouble();

        // Freezing_BoilingTemp getStatus = new Freezing_BoilingTemp(temperature);

        // getTempStatus(getStatus);

        //come back too

    //*************************************************************************************************************

    //number 12
        // Scanner input = new Scanner(System.in);
        // double depositAMT, withdrawAMT;
        // double totalDeposit = 0, totalWithdraw = 0, totalInterest = 0;

        // double startingBalance = getBalance();
        // double interest = getInterestRate();
        // int months = getMonths();

        // SavingsAccount money = new SavingsAccount(startingBalance, interest);

        // for (int i = 0; i < months; i++)
        // {
        //     System.out.print("How much did you deposit in month " + (i + 1) + "? $");
        //     depositAMT = input.nextDouble();
        //     money.SetDeposit(depositAMT);
        //     totalDeposit += depositAMT;

        //     System.out.print("How much did you withdraw in month " + (i + 1) + "? $");
        //     withdrawAMT = input.nextDouble();
        //     money.SetWithdraw(withdrawAMT);
        //     totalWithdraw += withdrawAMT;
        // }

        // money.addInterest(interest);
        // totalInterest = money.balance() - startingBalance;

        // double totalMoney = money.balance();

        // System.out.printf("Total ending balance is $%.2f\n", totalMoney);
        // System.out.printf("Total deposits: $%.2f\n", totalDeposit);
        // System.out.printf("Total withdraws: $%.2f\n", totalWithdraw);
        // System.out.printf("Total interest earned: $%.2f\n", totalInterest);

     //*************************************************************************************************************

    //number 13 (extenstion of 12)
        // Scanner input = new Scanner(System.in);

        // double depositAMT = 0, withdrawAMT = 0;
        // double totalDeposit = 0, totalWithdraw = 0, totalInterest = 0;
        // double totalMoney = 0;

        // double startingBalance = getBalance();
        // double interest = getInterestRate();
        

        // SavingsAccount money = new SavingsAccount(startingBalance, interest);

        // //opening deposit file
        // File depositFile = new File("Deposits.txt");
        // Scanner inputFile = new Scanner(depositFile);

        // //opening withdraw file
        // File withdrawFile = new File("Withdraws.txt");
        // Scanner inputFile2 = new Scanner(withdrawFile);

        // while (inputFile.hasNext() && inputFile2.hasNext())
        // {
        //     depositAMT = inputFile.nextDouble();
        //     money.SetDeposit(depositAMT);

        //     withdrawAMT = inputFile2.nextDouble();
        //     money.SetWithdraw(withdrawAMT);
        // }

        // totalMoney += money.balance();

        // money.addInterest(interest);
        // totalInterest = money.balance() - startingBalance;

        // //close file
        // inputFile.close();
        // inputFile2.close();
        

        // System.out.printf("Total ending balance is $%.2f\n", totalMoney);
        // System.out.printf("Total interest earned: $%.2f\n", totalInterest);

    //*************************************************************************************************************

    //number 14
        
        Patient patient1 = new Patient("Prethel Alam" , "1234 Marry Way" , "1234567891" , "Zeus Alam", "123-123-4567");

        Procedure procedure1 = new Procedure("Physical Exam", "Todays Date", "Dr. Irvine", 250.00);

        Procedure procedure2 = new Procedure("X-ray", "Todays Date", "Dr. Jamison", 500.00);

        Procedure procedure3 = new Procedure("Blood test", "Todays Date", "Dr. Smith", 200.00);

        System.out.println("Patient's name: " + patient1.getName());
        System.out.println("Patient's address: " + patient1.getAddress());
        System.out.println("Patient's phone number: " + patient1.getPhone());
        System.out.println("Patient's emergency contact name: " + patient1.getEmergencyName());
        System.out.println("Patient's emergency contact phone number: " + patient1.getEmergencyNumber());
        System.out.println();
        
        System.out.println("Procedure #1\t\t\t\tProcedure #2\t\t\t\tProcedure #3");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Procedure name: " + procedure1.getDate() 
                        + "\t\t" + "Procedure name: " + procedure2.getDate() + "\t\t" + "Procedure name: " + procedure3.getDate());
        System.out.println("Date: " + procedure1.getDate() 
                        + "\t\t\t" + "Date: " + procedure2.getDate() + "\t\t\t" + "Date: " + procedure3.getDate());
        System.out.println("Practioner: " + procedure1.getDoctorName() 
                        + "\t\t\t" + "Practioner: " + procedure2.getDoctorName() + "\t\t\t" + "Practioner: " + procedure3.getDoctorName());
        System.out.println("ChargeCharge: " + procedure1.getCost() 
                        + "\t\t\t" + "Charge: " + procedure2.getCost() + "\t\t\t\t" + "Charge: " + procedure3.getCost());
        System.out.println();
        System.out.println("Total Charge for all 3 Procedures: $" + (procedure1.getCost() + procedure2.getCost() + procedure3.getCost()));

    //*************************************************************************************************************

    //number 15
        
    

    



    



    } //end of main method






    //Methods

    //number 1
    public static void displayEmployeeInformation(Employee employee)
    {
        System.out.println(employee.getName() + "\t" + employee.getIdNumber() + "\t\t\t" + employee.getDepartment() + "\t\t" + employee.getPosition());
    }
    //*************************************************************************************************************

    //number 2
    public static void displaySpeedInc(Car car)
    {
        for(int i = 0; i < 5; i++)
        {
            car.accerlerate();
            System.out.println(car.getSpeed());
        }
    }

    public static void displaySpeedDec(Car car)
    {
        for(int i = 0; i < 5; i++)
        {
            car.brake();
            System.out.println(car.getSpeed());
        }
    }

    //*************************************************************************************************************

    //number 3
    public static void displayInformation(PersonalData information)
    {
        System.out.println(information.getName() + "\n" + information.getAddress() + "\n" + information.getAge() + "\n" +
                            information.getNumber());
    }

    //*************************************************************************************************************

    //number 4
    public static void displayClothingInfo(RetailItem table)
    {
        System.out.println("\t\t" + table.getDescription() + "\t\t" + table.getUnits() + "\t\t\t" + table.getPrice());
    }

    //*************************************************************************************************************

    //number 5
    public static void displayGrossPay(double grossPay)
    {
        System.out.printf("The employess gross pay is $%.2f", grossPay);
    }

    //*************************************************************************************************************

    //number 7
    public static void displayCircleInformation(Circle circleInfo)
    {
        System.out.printf("The area of the circle is %.2f\n", circleInfo.getArea());
        System.out.printf("The diameter of the circle is %.2f\n", circleInfo.getDiameter());
        System.out.printf("The circumference of the circle is is %.2f\n", circleInfo.getCircumference());
    }

    //*************************************************************************************************************

    //number 8
    public static void displayCelsius(Temperature temp)
    {
        System.out.printf("The temperature in celsius is %.2f\n", temp.getCelsius());
    }

    public static void displayKelvin(Temperature temp)
    {
        System.out.printf("The temperature in kelvin is %.2f\n", temp.getKelvin());
    }

     //*************************************************************************************************************

    //number 9

    public static int getDaysInMonth(MonthDays days, int month, int year)
    {
        int daysInMonth = 0;

        switch(month)
    {
        case 1: daysInMonth = 31;
                break;
        case 2: daysInMonth = days.numberOfDays();
                break;        
        case 3: daysInMonth = 31;
                break;
        case 4: daysInMonth = 30;
                break;
        case 5: daysInMonth = 31;
                break;
        case 6: daysInMonth = 30;
                break;
        case 7: daysInMonth = 31;
                break;
        case 8: daysInMonth = 31;
                break;
        case 9: daysInMonth = 30;
                break;
        case 10: daysInMonth = 31;
                break;
        case 11: daysInMonth = 30;
                break;
        case 12: daysInMonth = 31;
                break;
    }

        return daysInMonth;
    }

    public static void displayDays(int days, int month, int year)
    {
        System.out.println("There are " + days + " days.");
    }

    //*************************************************************************************************************

    //number 10
        //come back to this since it will take a while to code


    //*************************************************************************************************************

    //number 11
    
    public static void getTempStatus(Freezing_BoilingTemp temp)
    {

        if (temp.isOxygenFreezing() == true)
        {
        System.out.println( "Oxygen will freeze");
        System.out.println("Ethyl alcohol will freeze");
        System.out.println("Water will freeze");
        }
        else if (temp.isOxygenFreezing() == true && temp.isOxygenBoiling() == true)
        {
            System.out.println( "Ethyl alcohol will freeze");
            System.out.println( "Water will freeze");
        }
        else if (temp.isOxygenBoiling() == true && temp.isEthylFreezing() == true)
        {
            System.out.println("Ethyl alcohol will freeze");
            System.out.println("Water will freeze");
            System.out.println("Oxygen will boil");
        }
        else if (temp.isEthylFreezing() == true&& temp.isWaterFreezing() == true)
        {
            System.out.println( "Water will freeze");
            System.out.println("Oxygen will boil");
        }
        else if (temp.isWaterFreezing() == true && temp.isEthylBoiling() == true)
        {
            System.out.println( "Oxygen will boil");
        }
        else if (temp.isEthylBoiling() == true && temp.isWaterBoiling() == true)
        {
            System.out.println("Ethyl alcohol will boil");
            System.out.println( "Oxygen will boil");
        }
        else if (temp.isWaterBoiling() == true)
        {
            System.out.println( "Ethyl alcohol will boil");
            System.out.println( "Water will boil");
            System.out.println( "Oxygen will boil");
        }
        
    }

    //*************************************************************************************************************

    //number 12 and 13

    public static double getBalance()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your starting balance: $");
        double balance = input.nextDouble();

        return balance;
    }

    public static double getInterestRate()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your interest rate: ");
        double rate = input.nextDouble();

        return rate;
    }

    public static int getMonths()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many months have passed since the account was opened: ");
        int numMonths = input.nextInt();

        return numMonths;
    }

    //*************************************************************************************************************

    //number 15


}
