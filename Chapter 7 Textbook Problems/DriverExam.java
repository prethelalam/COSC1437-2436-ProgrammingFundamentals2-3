public class DriverExam {
    private char[] correctAnswers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 
    'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
    private char[] studentAnswers;

    public DriverExam()
    {
        studentAnswers = new char[20];
    }

    //setter
    public void setStudentAnswers(char[] answer, int index)
    {
        studentAnswers[index] = answer[index];
    }

    //methods
    public boolean passed()
    {
        boolean status = false;
        int correct = 0;

        for(int i = 0; i < correctAnswers.length; i++)
        {
            
            if(studentAnswers[i] == correctAnswers[i])
            {
                correct++;
            }
        }

        if(correct >= 15)
        {
            status = true;
        }

        return status;
    }

    public int totalCorrect()
    {
        int correct = 0;

        for(int i = 0; i < correctAnswers.length; i++)
        {
            
            if(studentAnswers[i] == correctAnswers[i])
            {
                correct++;
            }
        }

        return correct;
    }

    public int totalIncorrect()
    {
        int incorrect = 0;

        for(int i = 0; i < correctAnswers.length; i++)
        {
            
            if(studentAnswers[i] != correctAnswers[i])
            {
                incorrect++;
            }
        }

        return incorrect;
    }

    public int[] questionsMissed(int incorrect)
    {
        int[] questionsMissed = new int[incorrect];
        int j = 0;
    
        for (int i = 0; i < correctAnswers.length; i++) 
        {
            if (studentAnswers[i] != correctAnswers[i]) 
            {
                questionsMissed[j] = i + 1; 
                j++;
            }
        }
    
        return questionsMissed;
    }
}