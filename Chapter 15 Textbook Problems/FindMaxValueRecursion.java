public class FindMaxValueRecursion {
    public static int FindMaxValue(int[] array, int counter, int highest)
    {
        if(array[counter] == highest) //base case
        {
            return array[counter];
        }
        else
        {
            return FindMaxValue(array, counter + 1, highest);
        }
    }

    public static int FindHighest(int[] array) //works
    {
        int highest = array[0];

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > highest)
            {
                highest = array[i];
            }
        }

        return highest;
    }
}
