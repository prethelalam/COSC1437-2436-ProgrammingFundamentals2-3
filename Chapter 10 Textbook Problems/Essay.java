public class Essay extends GradedActivity {
    private int grammer;
    private int spelling;
    private int correctLength;
    private int content;
    private int totalScore;

    public Essay(int grammer, int spelling, int correctLength, int content)
    {
        super(); //this is gonna make score 0
        this.grammer = grammer;
        this.spelling = spelling;
        this.correctLength = correctLength;
        this.content = content;
        setTotalScore(grammer, spelling, correctLength, content);
    }

    public void setTotalScore(int grammer, int spelling, int correctLength, int content)
    {
        totalScore = grammer + spelling + correctLength + content;
    }

    public int getGrammerScore()
    {
        return grammer;
    }

    public int getSpellingScore()
    {
        return spelling;
    }

    public int getCorrectLengthScore()
    {
        return correctLength;
    }

    public int getContentScore()
    {
        return content;
    }

    public int getTotalScore()
    {
        return totalScore;
    }

}
