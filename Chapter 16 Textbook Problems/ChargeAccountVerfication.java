public class ChargeAccountVerfication {
    public static boolean accountVerification(int[] array, int value)
    {
        boolean status = false;
        int position = -1;

        position = sequentialSearch.search(array, value);

        if(position == -1)
        {
            return status;
        }
        else
        {
            status = true;
            return status;
        }
    }
}
