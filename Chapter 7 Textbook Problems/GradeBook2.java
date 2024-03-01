public class GradeBook2 {
    //create 3 fields (string array to hold names, char array to hold letter grade, and 5 arrays of 4 doubles for test scores)
    private String[] names;
    private char[] letterGrade;
    private double[] student1Scores;
    private double[] student2Scores;
    private double[] student3Scores;
    private double[] student4Scores;
    private double[] student5Scores;

    //constructor
    public GradeBook2()
    {
        names = new String[5];
        letterGrade = new char[5];
        student1Scores = new double[4];
        student2Scores = new double[4];
        student3Scores = new double[4];
        student4Scores = new double[4];
        student5Scores = new double[4];
    }

    //setters
    public void setNames(String studentNames, int index)
    {
        names[index] = studentNames;
    }

    public void setLetterGrade(char[] grade, int index)
    {
        letterGrade[index] = grade[index];
    }

    public void setStudentScore(double test, int index, int count)
    {
        if(count == 0)
        {
            student1Scores[index] = test;
        }
        else if (count == 1)
        {
            student2Scores[index] = test;
        }
        else if (count == 2)
        {
            student3Scores[index] = test;
        }
        else if (count == 3)
        {
            student4Scores[index] = test;
        }
        else if (count == 4)
        {
            student5Scores[index] = test;
        }
    }

    //methods
    public String getNames(int index)  
    {
        return names[index];
    }

    //get average test grade
    public double getTestAvg(int student) 
    {
        double totalScore = 0;
        double lowest;

        if (student == 0)
        {
            lowest = student1Scores[0];

            for(int i = 0; i < student1Scores.length; i++)
            {
                if(student1Scores[i] < lowest)
                {
                    lowest = student1Scores[i];
                }
            }
            for(int i = 0; i < student1Scores.length; i++)
            {
                totalScore += (student1Scores[i]);
            }
            
            totalScore -= lowest;
        }
        else if (student == 1)
        {
            lowest = student2Scores[0];

            for(int i = 0; i < student2Scores.length; i++)
            {
                if(student2Scores[i] < lowest)
                {
                    lowest = student2Scores[i];
                }
            }
            for(int i = 0; i < student2Scores.length; i++)
            {
                totalScore += student2Scores[i];
            }

            totalScore -= lowest;
        }
        else if (student == 2)
        {
            lowest = student3Scores[0];

            for(int i = 0; i < student3Scores.length; i++)
            {
                if(student3Scores[i] < lowest)
                {
                    lowest = student3Scores[i];
                }
            }
            for(int i = 0; i < student3Scores.length; i++)
            {
                totalScore += student3Scores[i];
            }

            totalScore -= lowest;
        }
        else if (student == 3)
        {
            lowest = student4Scores[0];

            for(int i = 0; i < student4Scores.length; i++)
            {
                if(student4Scores[i] < lowest)
                {
                    lowest = student4Scores[i];
                }
            }
            for(int i = 0; i < student4Scores.length; i++)
            {
                totalScore += student4Scores[i];
            }

            totalScore -= lowest;
        }
        else if (student == 4)
        {
            lowest = student5Scores[0];

            for(int i = 0; i < student5Scores.length; i++)
            {
                if(student5Scores[i] < lowest)
                {
                    lowest = student5Scores[i];
                }
            }
            for(int i = 0; i < student5Scores.length; i++)
            {
                totalScore += student5Scores[i];
            }

            totalScore -= lowest;
        }

        return totalScore/3;
    }

    //get letter grade
    public char getLetterGrade(double numericalGrade)
    {
        char grade = ' ';

        if(numericalGrade >= 90)
        {
            grade = 'A';
        }
        else if (numericalGrade < 90 && numericalGrade >= 80)
        {
            grade = 'B';
        }
        else if (numericalGrade < 80 && numericalGrade >= 70)
        {
            grade = 'C';
        }
        else if (numericalGrade < 70 && numericalGrade >= 60)
        {
            grade = 'D';
        }
        else if (numericalGrade < 60)
        {
            grade = 'F';
        }

        return grade;
    }
}
