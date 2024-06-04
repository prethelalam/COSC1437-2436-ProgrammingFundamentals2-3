public class CourseGrades extends GradedActivity {
    private GradedActivity grades[] = new GradedActivity[4];
    // private int labGrade;
    // private int passFail;
    // private int essayGrade;
    // private int FinalExamGrade;

    public void setLab(GradedActivity labGrade)
    {
        grades[0] = new GradedActivity();

    }

    public void setPassFailExam(PassFailExam examScore)
    {
        examScore.getPointsEach();
        grades[1] = examScore;

        // grades[1] = new PassFailExam(getGrade(), getGrade(), getGrade());
    }

    public void setEssay(Essay essayGrade)
    {   
        //essayGrade.essay(essayGrade.getGrammerScore());
        grades[2] = essayGrade;
    }

    public void setFinalExam(FinalExam finalGrade)
    {
        grades[3] = finalGrade;
    }

    public String toString()
    {
        StringBuilder display = new StringBuilder();

        for(int i = 0; i < grades.length; i++)
        {
            display.append("Assignment ").append(i+1).append(": ");
            display.append(grades[i]);
        }

        return display.toString();
    }
}
