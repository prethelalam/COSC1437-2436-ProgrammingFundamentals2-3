import java.util.Scanner;

public class Chapter15
{
    public static void main(String[] args) {
        // 1. **********************************************
        // System.out.println("Enter 2 numbers, seperated by the enter key, that you would like to multiply: ");

        // Scanner scanner = new Scanner(System.in);

        // int num1 = scanner.nextInt();
        // int num2 = scanner.nextInt();

        // System.out.println(RecursiveMultiplication.RecursiveMultiply(num1, num2));

        // // 2. **********************************************
        // int myArray[] = {1,2,3,4,5,6,7,8,9,10};

        // System.out.println("What number are you searching for: ");
        
        // Scanner scanner = new Scanner(System.in);

        // int value = scanner.nextInt();

        // System.out.println("Searching array for desired value.");

        // boolean status = isMember.MemberMethod(myArray, value, 0);

        // if(status)
        // {
        //     System.out.println("Value was found in array.");
        // }
        // else
        // {
        //     System.out.println("Value was not found in array."); //this is not working (look at class)
        // }
        
        // 3. **********************************************
        // System.out.print("Enter a word: ");
        // Scanner scanner = new Scanner(System.in);
        // String word = scanner.nextLine();

        // StringReverseRecursion.StringReverse(word);

        // 4. **********************************************
            int myArray[] = {1,2,4,5,67,23,6,3,99,34,76,22,65};

            System.out.print("The highest value in the array is: " + FindMaxValueRecursion.FindMaxValue(myArray, 0, FindMaxValueRecursion.FindHighest(myArray)));

            //System.out.println("highest value is: " + FindMaxValueRecursion.FindHighest(myArray));
    }
}