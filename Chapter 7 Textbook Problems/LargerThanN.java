public class LargerThanN {
    //method
    public void getLargerThanN(int[] num, int n) //sequential search (modified version)
    {
        int indexNum = 0;
        int i;

        for(i = 0; i < num.length; i++)
        {
            if(num[i] > n)
            {
                indexNum = i;
                break;
            }
        }

        System.out.println("The numbers that are bigger than " + n + " are: ");

        for(int j = indexNum; j < num.length; j++)
        {
            System.out.println(num[j]);
        }
    }
}