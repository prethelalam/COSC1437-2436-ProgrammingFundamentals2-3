import java.util.Scanner;
import java.io.*;
import java.util.Random;


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
        // Scanner input = new Scanner(System.in);
        // LargerThanN num = new LargerThanN();

        // int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        // int decision;

        
        // System.out.print("Enter a number between 1 and 100: ");
        
        // decision = input.nextInt();
        
        // num.getLargerThanN(numbers, decision);

    //*********************************************************************************

        //number 6
    //     Scanner scanner = new Scanner(System.in);
    //     DriverExam exam = new DriverExam();
    //     char[] studentsResponse = new char[20];
    //     int i;

    //     System.out.println("Enter your answers for the exam (in all caps):");
    //     char answer = ' ';

    //     for (i = 0; i < 20; i++) 
    //     {
    //         System.out.print((i + 1) + ". ");
    //         boolean validInput = false;
        
    //         //Loop until valid input is provided
    //         while (!validInput) 
    //         {
    //             String input = scanner.nextLine();

    //             if (input.length() == 1 && "ABCD".indexOf(input.charAt(0)) != -1) 
    //             {
    //                 //Input is a single character and is A, B, C, or D
    //                 answer = input.charAt(0);
    //                 validInput = true;
    //             } 
    //             else 
    //             {
    //                 //Invalid input, prompt the user to re-enter
    //                 System.out.println("Invalid input. Please enter A, B, C, or D:");
    //             }
    //         }
        
    //         studentsResponse[i] = answer;
    //         exam.setStudentAnswers(studentsResponse, i);
    //     }

    //     //check to see if student passed or not
    //     System.out.println("The student passed the exam: " + exam.passed());

    //     //total Correct
    //     System.out.println("The student got " + exam.totalCorrect() + " questions correct");

    //     //total incorrect
    //     System.out.println("The student got " + exam.totalIncorrect() + " questions incorrect");

    //     //pass incorrect amount to questionsMissed method
    //     System.out.println("The questions the student missed were: ");

    //     int totalIncorrect = exam.totalIncorrect();

    //     for(int j = 0; j < totalIncorrect; j++)
    //     {
    //         System.out.println(exam.questionsMissed(totalIncorrect)[j]);
    //     }
    // 

    //*********************************************************************************

        //number 8
        Scanner scanner = new Scanner(System.in);
        Random randomNum = new Random();

        // 1. read responses from text file into an array or arrayList

        String[] ballResponses = new String[12];

        //open the file

        File myFile = new File("8_ball_responses.txt");
        Scanner inputFile = new Scanner(myFile);

        //Read the first line from the file to an array

        for(int i = 0; i < ballResponses.length; i++)
        {
            ballResponses[i] = inputFile.nextLine();
        }

        inputFile.close();

        // 2. prompt user to ask a question

        String question = "";

        // 3. display one of the responses (should be randomly generated)
        // 4. program repeats until user is ready to quit

        while (!question.equals("quit"))
        {
            int number = randomNum.nextInt(12);

            System.out.println("Ask any question that is on your mind.");
            System.out.println("When you are done asking questions, enter the word quit.");
            question = scanner.nextLine();

            if(question.equals("quit"))
            {
                break;
            }

            System.out.println(ballResponses[number] + "\n");
        }

        
        
        
    }
}
