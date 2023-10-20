import java.util.Scanner;

public class Chapter6TextbookProblems {
    public static void main(String[] args) {

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
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the name of an employee: ");
    String name = input.nextLine();
    System.out.print("Enter the employees ID number: ");
    int IDNum = input.nextInt();
    System.out.print("Enter the employees pay rate: ");
    double pay = input.nextDouble();
    System.out.print("Enter the amount of hours the employee has worked: ");
    int hours = input.nextInt();

    Payroll employee = new Payroll(name, IDNum);
    employee.setPayRate(pay); //have to individually set since constructor doesnt have those parameters
    employee.setHours(hours);

    double grossPay = employee.getGrossPay();

    displayGrossPay(grossPay);







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

}
