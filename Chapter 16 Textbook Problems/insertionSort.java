public class insertionSort {

    public static void insertionSorter(int[] array)
    {
        int unsortedValue;
        int scan;

        //this other loop steps the index vairable through each subscript 
        for(int index = 1; index < array.length; index++)
        {
            //this is the first value which is unsorted
            unsortedValue = array[index];

            //this is where the scan will begin (index 1)
            scan = index;

            //moving the unsorted elements to the sorted area
            while(scan > 0 && array[scan - 1] > unsortedValue)
            {
                array[scan] = array[scan-1];
                scan--;
            }

            //insert the unsorted value in its proper place within the sorted part
            array[scan] = unsortedValue;
        }
    }
}
