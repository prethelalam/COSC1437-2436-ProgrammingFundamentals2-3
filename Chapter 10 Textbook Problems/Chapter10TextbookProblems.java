import java.util.Scanner;

public class Chapter10TextbookProblems{
    public static void main(String[] args) {
        //1 **************************************
        // System.out.print("Enter the employee's name: ");

        // Scanner scanner = new Scanner(System.in);
        // String name = scanner.nextLine();

        // System.out.print("Enter the employee's number (###L): ");
        // String number = scanner.nextLine();

        // System.out.print("Enter the employee's hire date (MMDDYY): ");
        // int date = scanner.nextInt();

        // System.out.print("Enter the shift you will work (AM = 1, PM = 2): ");
        // int shift = scanner.nextInt();

        // System.out.print("Enter the pay rate for the employee: ");
        // double payRate = scanner.nextDouble();

        // //Employee employee = new Employee(name, number, date);
        // ProductionWorker worker = new ProductionWorker(name, number, date, shift, payRate);

        // System.out.println("Employees name: " + worker.getEmployeeName());
        // System.out.println("Employees number: " + worker.getEmployeeNumber());
        // System.out.println("Employees hire date: " + worker.getHireDate());

        // if (worker.getShift() == 1)
        // {
        //     System.out.println("Employees shift: AM");
        // }
        // else if (worker.getShift() == 2)
        // {
        //     System.out.println("Employees Shift: PM");
        // }

        // System.out.println("The employees pay is: " + worker.getPay());

        //2 **************************************
        // System.out.print("Enter the supervisors name: ");

        // Scanner scanner = new Scanner(System.in);
        // String name = scanner.nextLine();

        // System.out.print("Enter the supervisors number (###L): ");
        // String number = scanner.nextLine();

        // System.out.print("Enter the supervisors hire date (MMDDYY): ");
        // int date = scanner.nextInt();

        // System.out.print("Enter the supervisors annual salary: ");
        // double salary = scanner.nextDouble();

        // System.out.print("Enter the supervisors annual bonus: ");
        // double bonus = scanner.nextDouble();

        // ShiftSupervisor supervisor = new ShiftSupervisor(salary, bonus, name, number, date);

        // System.out.println("Supervisors name: " + supervisor.getEmployeeName());
        // System.out.println("Supervisors number: " + supervisor.getEmployeeNumber());
        // System.out.println("Supervisors hire date: " + supervisor.getHireDate());
        // System.out.println("Supervisors annual salary: " + supervisor.getSalary());
        // System.out.println("Supervisors annual bonus: " + supervisor.getBonus());

        //3 **************************************

        // System.out.print("Enter the employee's name: ");

        // Scanner scanner = new Scanner(System.in);
        // String name = scanner.nextLine();

        // System.out.print("Enter the employee's number (###L): ");
        // String number = scanner.nextLine();

        // System.out.print("Enter the employee's hire date (MMDDYY): ");
        // int date = scanner.nextInt();

        // System.out.print("Enter the shift you will work (AM = 1, PM = 2): ");
        // int shift = scanner.nextInt();

        // System.out.print("Enter the pay rate for the employee: ");
        // double payRate = scanner.nextDouble();

        // System.out.print("Enter the monthly bonus for the employee: ");
        // double bonus = scanner.nextDouble();

        // System.out.print("Enter the required number of hours the need to be completed by the employee: ");
        // int hoursNeeded = scanner.nextInt();

        // System.out.print("Enter the required number of hours the need to be completed by the employee: ");
        // int hoursCompleted = scanner.nextInt();

        // TeamLeader teamLeader = new TeamLeader(name, number, date, shift, payRate, bonus, hoursNeeded, hoursCompleted);

        // System.out.println("Employee's name: " + teamLeader.getEmployeeName());
        // System.out.println("Employee's number: " + teamLeader.getEmployeeNumber());
        // System.out.println("Employee's hire date: " + teamLeader.getHireDate());
        // if (teamLeader.getShift() == 1)
        // {
        //     System.out.println("Employees shift: AM");
        // }
        // else if (teamLeader.getShift() == 2)
        // {
        //     System.out.println("Employees Shift: PM");
        // }

        // System.out.println("The employees pay rate is: " + teamLeader.getPay());
        // System.out.println("Employee's monthly bonus: " + teamLeader.getMonthlyBonus());
        // System.out.println("Employee's required number of hours: " + teamLeader.getRequiredHours());
        // System.out.println("Employee's completed number of hours: " + teamLeader.getHoursCompleted());

        //4 **************************************

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("How many points did the student earn for his/her grammer (30 points): ");
        // int grammerScore = scanner.nextInt();

        // System.out.print("How many points did the student earn for his/her spelling (20 points): ");
        // int spellingScore = scanner.nextInt();

        // System.out.print("How many points did the student earn for his/her essay length (20 points): ");
        // int lengthScore = scanner.nextInt();

        // System.out.print("How many points did the student earn for his/her content (30 points): ");
        // int contentScore = scanner.nextInt();

        // Essay essay = new Essay(grammerScore, spellingScore, lengthScore, contentScore);

        // essay.setTotalScore(grammerScore, spellingScore, lengthScore, contentScore);

        // essay.setScore(essay.getTotalScore());

        // System.out.println("The students grade for this essay is: " + essay.getGrade());

        //5 **************************************
        CourseGrades courses = new CourseGrades();

        Scanner scanner = new Scanner(System.in);

        System.out.print("What did the student receive on the lab assignment: ");
        double labScore = scanner.nextDouble();

        GradedActivity labActivity = new GradedActivity();
        labActivity.setScore(labScore);

        //double labGrade = labActivity.getScore();

        courses.setLab(labActivity);

        System.out.print("How many questions were there on the exam?: ");
        int questionsAmt = scanner.nextInt();

        System.out.print("How many questions were missed on the exam: ");
        int incorretQuestion = scanner.nextInt();

        System.out.print("What is the minimum passing grade: ");
        double minPassing = scanner.nextInt();

        PassFailExam examScore = new PassFailExam(questionsAmt, incorretQuestion, minPassing);
        courses.setPassFailExam(examScore);

        System.out.print("What are the various grades for (grammer - 30 points), (spelling - 20 points), (correctLength - 20 points), (content - 30 points)- separate each number by pressing enter: ");
        int grammer = scanner.nextInt();
        int spelling = scanner.nextInt();
        int correctLength = scanner.nextInt();
        int content = scanner.nextInt();

        Essay essay = new Essay(grammer, spelling, correctLength, content);

        courses.setEssay(essay);

        System.out.print("How many questions were on the final exam? ");
        int questions = scanner.nextInt();

        System.out.print("How many questions did the student miss? ");
        int missed = scanner.nextInt();

        FinalExam finalExam = new FinalExam(questions, missed);
        courses.setFinalExam(finalExam);


        System.out.println(courses.toString());



    }
}
