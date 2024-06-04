public class TestScores {
    private int scores[] = new int[3];

    public TestScores(int testGrades[]) throws InvalidTestScore
    {
        for (int i = 0; i < scores.length; i++)
        {
            if (testGrades[i] < 0 || testGrades[i] > 100)
            {
                throw new InvalidTestScore("The test score must be between 0 and 100");
            }
            else
            {
                scores[i] = testGrades[i];
            }
        }
    }

    public double getAverage()
    {
        double total = 0.0;

        for(int i = 0; i < scores.length; i++)
        {
            total += scores[i];
        }

        return total / scores.length;
    }
    
}