public class TestScores {
    private double test1;
    private double test2;
    private double test3;

    public TestScores(double test1, double test2, double test3)
    {
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    public void setScore1(double test1)
    {
        this.test1 = test1;
    }

    public void setScore2(double test2)
    {
        this.test2 = test2;
    }

    public void setScore3(double test3)
    {
        this.test3 = test3;
    }

    public double getScore1()
    {
        return test1;
    }

    public double getScore2()
    {
        return test2;
    }

    public double getScor3e()
    {
        return test3;
    }

    public double getAverage()
    {
        return (test1 + test2 + test3) / 3;
    }
}
