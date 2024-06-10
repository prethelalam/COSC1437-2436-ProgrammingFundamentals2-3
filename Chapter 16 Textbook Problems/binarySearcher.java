public class binarySearcher {
    public static int search(int[] array, int value)
    {
        int first = 0, last = array.length - 1, position = -1;
        boolean found = false;
        int middle;

        while(!found && first <= last)
        {
            middle = (first + last) / 2;

            if(array[middle] == value)
            {
                found = true;
                position = middle;
            }
            else if(array[middle] > value)
            {
                last = middle - 1;
            }
            else
            {
                first = middle + 1;
            }
        }

        return position;
    }
}
