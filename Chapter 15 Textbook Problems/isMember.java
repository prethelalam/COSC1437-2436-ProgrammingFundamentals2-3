public class isMember {
    public static boolean MemberMethod(int array[], int desiredValue, int counter)
    {
        if(counter >= array.length) //base case
        {
            return false;
        }
        if(array[counter] == desiredValue) //base case
        {
            return true;
        }
        else
        {
            return MemberMethod(array, desiredValue, counter + 1);
        }
    }
}
