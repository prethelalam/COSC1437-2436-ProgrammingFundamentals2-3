public class LargerThanN {
    //method
    public void getLargerThanN(int[] num, int[] n)
    {
        //int smallest = num[0]; 
        int index;
        int i;
        System.out.print("The numbers that are bigger than " + n + " are: ");

        for(i = 0; i < num.length; i++)
        {
            if (n[0] < num[i])
            {
                index = i;
            }
        }
        for(index = i; index < num.length; index++)
        {
            System.out.println(num[index]);
        }
    }
}
