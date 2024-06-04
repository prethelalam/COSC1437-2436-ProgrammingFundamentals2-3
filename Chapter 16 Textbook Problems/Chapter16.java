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
    
    }
}