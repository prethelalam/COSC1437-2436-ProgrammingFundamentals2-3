public class ChargeAccountValidation {
    private int[] accountNums = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
        8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
        1005231, 6545231, 3852085, 7576651, 7881200, 4581002};

    //method

    public boolean sequentialSearch(int num)
    {
        boolean status = false;         //flag
        int index = 0;

        while(!status && index < accountNums.length)
        {
            if(accountNums[index] == num)
            {
                status = true;
                break;
            }

            index++;
        }
        

        return status;
    }

}
