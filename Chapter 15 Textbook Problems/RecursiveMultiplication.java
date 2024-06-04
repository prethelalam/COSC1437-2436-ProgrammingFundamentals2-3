public class RecursiveMultiplication {
    //function that accepts 2 arguments into the parameters

    public static int RecursiveMultiply(int x, int y)
    {
        if(y == 0) //base case
        {
            return 0;
        }
        else if(y == 1) //another base case
        {
            return x;
        }
        else
        {
            return x + RecursiveMultiply(x, y - 1);
        }
    }
}
