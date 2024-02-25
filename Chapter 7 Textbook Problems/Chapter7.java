import java.util.Scanner;
import java.io.*;


public class Chapter7 {
    public static void main(String[] args) throws IOException {
        
        // number 1

        // Scanner input = new Scanner(System.in);
        // Rainfall rainfall = new Rainfall(); //created rainfall object

        // for (int i = 0; i < 12; i++)
        // {
        //     System.out.print("Enter the total rainfall for month " + (i + 1) + " (in inches): ");
        //     double rainAmt = input.nextDouble();

        //     rainfall.setMonthlyRainFall(i + 1, rainAmt);
        // }
        // rainfall.displayInformation();
    //*********************************************************************************

        //number 2

        // Scanner input = new Scanner(System.in);
        // Payroll2 payInfo = new Payroll2();
        // double payAMT;
        // int hoursWorked;

        // for (int i = 0; i < 7; i++)
        // {
        //     do 
        //     {
        //         System.out.print("Enter the pay rate for employee " + payInfo.displayEmployeeID(i) + ": ");

        //         payAMT = input.nextDouble();
        //     } while(payAMT < 6.00);
            
        //     payInfo.setPayRate(payAMT, i);

        //     do 
        //     {
        //         System.out.print("Enter the amount of hours worked by employee " + payInfo.displayEmployeeID(i) + ": ");

        //         hoursWorked = input.nextInt();
        //     }while(hoursWorked < 0);
            
        //     payInfo.setHours(hoursWorked, i);
        // }

        // //have another for loop to display everything right here
        // System.out.print("Employee ID Number\t\tGross Pay\n");

        // for(int i = 0; i < 7; i++)
        // {
        //     System.out.print(payInfo.displayEmployeeID(i));
        //     System.out.printf("\t\t\t\t%.2f\n", payInfo.calcGrossPay(i));
        // }

    //*********************************************************************************

        //number 3
        // Scanner input = new Scanner(System.in);
        // ChargeAccountValidation account = new ChargeAccountValidation();
        // boolean status;

        // System.out.print("Enter a charge account number that is 7 digits long: ");
        // int number = input.nextInt();

        // status = account.sequentialSearch(number);

        // if (status)
        // {
        //     System.out.print("Number is valid");
        // }
        // else
        // {
        //     System.out.print("Number is invalid");
        // }
        
    //*********************************************************************************

        //number 4  

        // Scanner input = new Scanner(System.in);
        // AccountValidation account = new AccountValidation();
        // boolean status = false;
        // int index = 0;
        // int[] accountNums = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
        //                     8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
        //                     1005231, 6545231, 3852085, 7576651, 7881200, 4581002};

        // File textFile = new File("AccountNumbers.txt");

        // try(PrintWriter outputFile = new PrintWriter(textFile))
        // {
        //     for(int i = 0; i < accountNums.length; i++)
        //     {
        //         outputFile.println(accountNums[i]);
        //     }
        // }

        // System.out.print("Enter a charge account number that is 7 digits long: ");
        // int number = input.nextInt();

        // if(textFile.exists())
        // {   
        //     Scanner inputFile = new Scanner(textFile);

        //     while(inputFile.hasNextInt() && index < accountNums.length)
        //     {
        //         status = account.sequentialSearch2(number);

        //             if (status)
        //             {
        //                 System.out.print("Number is valid");
        //                 break;
        //             }
        //             else
        //             {
        //                 System.out.print("Number is invalid");
        //                 index++;
        //                 break;
        //             }
        //     }
        // }
        // else
        // {
        //     System.out.print("Text file does not exist");
        // }
    
    //*********************************************************************************

        //number 5
        Scanner input = new Scanner(System.in);
        LargerThanN num = new LargerThanN();

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] decision = new int[1];

        
        System.out.print("Enter a number between 1 and 100: ");

        for(int i = 0; i < decision.length; i++)
        {
            decision[0] = input.nextInt();
        }

        num.getLargerThanN(numbers, decision);


        //come back too
    }
}
