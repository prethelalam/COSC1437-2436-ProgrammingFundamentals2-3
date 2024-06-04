public class ObjectQuickSorter {
    // The IntQuickSorter class presented in this chapter sorts an array of int values. 
    // Create an ObjectQuickSorter class that can sort Comparable objects.
    // Demonstrate the class in a program that sorts an array of String objects.

    public static void quickSort(Comparable[] array)
    {
        doQuickSort(array, 0, array.length - 1);
    }

    private static void doQuickSort(Comparable[] array, int start, int end)
    {
        int pivotPoint;

        if(start < end)
        {
            //get pivot point
            pivotPoint = partition(array,start,end);

            //sort the first sublist
            doQuickSort(array, start, pivotPoint - 1);

            //sort the second sublsit
            doQuickSort(array, pivotPoint + 1, end);


        }
    }

    private static int partition(Comparable[] array, int start, int end)
    {
        Comparable pivotValue;     //to hold the pivot value
        int endOfLeftList;  //last element in the left sublist
        int mid;            //to hold the mid point subscript

        //first fine the subscript of the middle element (pivot)
        mid = (start + end) / 2;

        //swap the middle element with teh first element
        //this moves the pivot valeu to the start of the list
        swap(array, start, mid);

        //save pivot value for comparison
        pivotValue = array[start];

        //for now, the end of the left sublist is the first element
        endOfLeftList = start;

        //scan the entire list and move any values that are less than the pivot value to the left of the sublist
        for(int scan = start + 1; scan <= end; scan++)
        {
            if (array[scan].compareTo(pivotValue) < 0)
            {
                endOfLeftList++;
                swap(array, endOfLeftList, scan);
            }
        }

        //move the pivot value to the end of the left sublist
        swap(array, start, endOfLeftList);

        //return the subscript of the pivot value
        return endOfLeftList;
    }

    private static void swap(Comparable[] array, int a, int b)
    {
        Comparable temp;

        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
