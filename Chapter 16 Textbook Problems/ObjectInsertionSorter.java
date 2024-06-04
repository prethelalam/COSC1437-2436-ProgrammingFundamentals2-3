public class ObjectInsertionSorter {
    // The insertionSort method in the IntInsertionSorter class 
    // presented in this chapter sorts an array of int values. 
    // Create an ObjectInsertionSorter class that can sort Comparable objects. 
    // Demonstrate the class in a program that sorts an array of String objects.

    public static void insertionSorter(Comparable[] array)
    {
        Comparable unsortedValue;
        int scan;

        //this other loop steps the index vairable through each subscript 
        for(int index = 1; index < array.length; index++)
        {
            //this is the first value which is unsorted
            unsortedValue = array[index];

            //this is where the scan will begin (index 1)
            scan = index;

            //moving the unsorted elements to the sorted area
            while(scan > 0 && array[scan - 1].compareTo(unsortedValue) > 0)
            {
                array[scan] = array[scan-1];
                scan--;
            }

            //insert the unsorted value in its proper place within the sorted part
            array[scan] = unsortedValue;
        }
    }
}