import java.util.Scanner;
import java.util.Arrays;

public class Chapter16
{
    public static void main(String[] args) {
        // 1. **********************************************
            make an array of strings
            String[] names = {"bob", "tim", "zoey", "jim", "sam"};

            //dipslay the names
            for(int i = 0; i < names.length; i++)
            {
                System.out.println("Array values: " + names[i]);
            }

            //sorting the array
            ObjectInsertionSorter.insertionSorter(names);

            //diplsay sorted names
            for(int j = 0; j < names.length; j++)
            {
                System.out.println("Sorted array values: " + names[j]);
            }

         // 2. **********************************************
            //String array with test values
            String[] names = {"bob", "tim", "zoey", "jim", "sam"};

            //display array
            System.out.println("Original Order:");
            System.out.print(Arrays.toString(names) + " ");
            

            //sort the array
            ObjectQuickSorter.quickSort(names);

            //display array after sorting
            System.out.println("\nSorted Order:");
                System.out.print(Arrays.toString(names) + " ");

        // 3. **********************************************
            Comparable result, searchValue;
            String input;
        
            //create an array of numbers
            String number[] = {"bob", "tim", "zoey", "jim", "sam"};

            Scanner scanner = new Scanner(System.in);

            //sort the values
            ObjectQuickSorter.quickSort(number);
            
            do
            {
                //get value to search for
                System.out.print("Enter the value you wish to search for: ");
                searchValue = scanner.nextLine();

                //search for value
                result = ObjectBinarySearcher.binarySearch(number, searchValue);

                //display results
                if(result.equals(-1))
                {
                    System.out.println(searchValue + " was not found");
                }
                else
                {
                    System.out.println(searchValue + " was found at element " + result);
                }

                // //consume the remaining new line
                // scanner.nextLine();

                //search again option
                System.out.print("Do you want to search again? (Y or N): ");
                input = scanner.nextLine();
            } while(input.charAt(0) == 'y' || input.charAt(0) == 'Y');

            // 4. **********************************************
                int[] accountNums = {5658845, 4520125, 7895122, 8080152, 4562555, 5552012, 1005231, 
                                    6545231, 3852085, 8777541, 5050552,  7576651, 8451277, 7825877,
                                    7881200, 1302850, 1250255, 4581002};
                
                System.out.print("Enter the account number you would like to validate: ");
                Scanner scanner = new Scanner(System.in);
                int targetValue = scanner.nextInt();

                boolean status = ChargeAccountVerfication.accountVerification(accountNums, targetValue);

                if(status == true)
                {
                    System.out.print("The account number is valid");
                }
                else
                {
                    System.out.print("The account number is not valid");
                }

            // 5. **********************************************
                int[] accountNums = {5658845, 4520125, 7895122, 8080152, 4562555, 5552012, 1005231, 
                                    6545231, 3852085, 8777541, 5050552, 7576651, 8451277, 7825877,
                                    7881200, 1302850, 1250255, 4581002};

                //sorting array
                insertionSort.insertionSorter(accountNums);
                
                System.out.print("Enter the account number you would like to validate: ");
                Scanner scanner = new Scanner(System.in);
                int targetValue = scanner.nextInt();

                //binary searcher
                int index = binarySearcher.search(accountNums, targetValue);

                if(index > -1)
                {
                    System.out.print("The account number is valid");
                }
                else
                {
                    System.out.print("The account number is not valid");
                }
    }
}