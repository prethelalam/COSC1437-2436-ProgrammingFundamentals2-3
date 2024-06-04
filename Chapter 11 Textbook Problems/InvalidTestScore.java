public class InvalidTestScore extends Exception{
    private int scores[] = new int[3];

    public InvalidTestScore(String message)
    {
        super(message);
    }
}
