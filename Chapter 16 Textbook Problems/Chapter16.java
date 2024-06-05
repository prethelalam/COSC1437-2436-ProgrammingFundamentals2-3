import java.util.Scanner;
import java.util.Arrays;

public class Chapter16
{
    public static void main(String[] args) {
        // 1. **********************************************
            //make an array of strings
            // String[] names = {"bob", "tim", "zoey", "jim", "sam"};

            // //dipslay the names
            // for(int i = 0; i < names.length; i++)
            // {
            //     System.out.println("Array values: " + names[i]);
            // }

            // //sorting the array
            // ObjectInsertionSorter.insertionSorter(names);

            // //diplsay sorted names
            // for(int j = 0; j < names.length; j++)
            // {
            //     System.out.println("Sorted array values: " + names[j]);
            // }

         // 2. **********************************************
            // //String array with test values
            // String[] names = {"bob", "tim", "zoey", "jim", "sam"};

            // //display array
            // System.out.println("Original Order:");
            // System.out.print(Arrays.toString(names) + " ");
            

            // //sort the array
            // ObjectQuickSorter.quickSort(names);

            // //display array after sorting
            // System.out.println("\nSorted Order:");
            //     System.out.print(Arrays.toString(names) + " ");

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
                
    }
}