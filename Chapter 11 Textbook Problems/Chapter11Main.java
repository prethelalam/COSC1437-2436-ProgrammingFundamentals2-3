import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.IllegalArgumentException;


public class Chapter11Main {
    public static void main(String[] args) throws InvalidTestScore, InvalidPrice, InvalidUnits, InvalidPayRate, InvalidHours, FileNotFoundException, IOException {
        //1 *******************************************
        // final int numTests = 3;
        // int scores[] = new int[numTests];

        // Scanner scanner = new Scanner(System.in);
        // TestScores testScores = new TestScores(scores);
    
        // try 
        // {
        //     for(int i = 0; i < numTests; i++)
        //     {
        //     System.out.print("Enter your test #" + (i + 1) + " score: ");
        //     scores[i] = scanner.nextInt();

        //     testScores = new TestScores(scores);
        //     }
            
        //     System.out.println("The test's average score is: " + testScores.getAverage());
        // }
        // catch (IllegalArgumentException e)
        // {
        //     System.out.print("Error: " + e.getMessage());
        // }

        //2 *******************************************
        // final int numTests = 3;
        // int scores[] = new int[numTests];

        // Scanner scanner = new Scanner(System.in);
        // TestScores testScores = new TestScores(scores);
    
        // try 
        // {
        //     for(int i = 0; i < numTests; i++)
        //     {
        //     System.out.print("Enter your test #" + (i + 1) + " score: ");
        //     scores[i] = scanner.nextInt();

        //     testScores = new TestScores(scores);
        //     }
            
        //     System.out.println("The test's average score is: " + testScores.getAverage());
        // }
        // catch (InvalidTestScore e)
        // {
        //     System.out.print("Error: " + e.getMessage());
        // }

        //3 *******************************************
        // try 
        // {
        //     RetailItem item1 = new RetailItem("Jacket\t", -20, -20);
        //     RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
        //     RetailItem item3 = new RetailItem("Shirt\t", 20, 24.95);
        // }
        // catch (InvalidUnits | InvalidPrice e)
        // {
        //     System.out.print("Error: " + e.getMessage());
        // }
        

        // System.out.println("\t\tDescription:\t\tUnits on Hand\t\tPrice");
        // System.out.println("----------------------------------------------------------------------");
        
        //4 *******************************************
        //skip this one

        //5 *******************************************

        // Scanner input = new Scanner(System.in);

        // System.out.print("Enter the name of an employee: ");
        // String name = input.nextLine();
        // System.out.print("Enter the employees ID number: ");
        // int IDNum = input.nextInt();
        // System.out.print("Enter the employees pay rate: ");
        // double pay = input.nextDouble();
        // System.out.print("Enter the amount of hours the employee has worked: ");
        // int hours = input.nextInt();

        // try
        // {
        //     Payroll employee = new Payroll(name, IDNum);
        //     employee.setPayRate(pay); //have to individually set since constructor doesnt have those parameters
        //     employee.setHours(hours);

        //     double grossPay = employee.getGrossPay();

        //     Payroll.displayGrossPay(pay);
        // }   
        // catch (IllegalArgumentException | InvalidPayRate | InvalidHours e)
        // {
        //     System.out.println("Error: " + e.getMessage());
        // }

        //6 *******************************************

        Scanner scanner = new Scanner(System.in);
        int numArray[] = new int[4];

        System.out.println("You will be entering 4 different numbers that will be stored in a binary file");

        for(int i = 0; i < numArray.length; i++)
        {
            System.out.println("Enter number " + (i + 1) + ": ");
            numArray[i] = scanner.nextInt();
        }

        String fileName = "MyInfo.dat";

        try(FileOutputStream fstream = new FileOutputStream(fileName, true); DataOutputStream outputFile = new DataOutputStream(fstream))
        {
            FileArray.writeArray(fileName, numArray); 

            FileArray.readArray(fileName, numArray); //its reading the numbers but its 1 off
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: File not found. " + e.getMessage());
        }
        
    }
}
