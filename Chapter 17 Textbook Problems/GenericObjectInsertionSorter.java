public class GenericObjectInsertionSorter {
    // In Programming Challenge 1 of Chapter 16 you wrote an ObjectInsertionSorter class that can sort Comparable objects. Modify the sorting method so it is a generic method. The method should use generic notation to accept an array of any objects that implement the Comparable interface. Demonstrate the class in an application.

    public <T extends Comparable<T>> void insertionSorter(T[] array)
    {
        T unsortedValue;
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
