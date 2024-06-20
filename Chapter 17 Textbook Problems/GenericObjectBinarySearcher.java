public class GenericObjectBinarySearcher {

    public <T extends Comparable<T>> int genericBinarySearch(T[] array, T value)
    {
        int first;      //first array element
        int last;       //last array element
        int middle;     //mid point of search
        int position;   //position of the search value
        boolean found;  //flag 

        //set intial value
        first = 0;
        last = array.length - 1;
        position = -1;
        found = false;

        //search for the vlaue
        while(!found && first <= last)
        {
            //calculate midpoint
            middle = (first + last) / 2;

            //value found at mid point
            if(array[middle].compareTo(value) == 0)
            {
                found = true;
                position = middle;
            }
            //else if value is in lower half
            else if (array[middle].compareTo(value) > 0)
            {
                last = middle - 1;
            }
            //else if value is in upper half
            else
            {
                first = middle + 1;
            }
        }
        return position;
    }
}
