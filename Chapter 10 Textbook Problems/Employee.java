import java.util.Scanner;

public class Employee {
    private String employeeName;
    private String employeeNumber;
    private int date;

    public Employee (String name, String number, int date)
    {
        employeeName = name;
        this.date = date;
        setEmployeeNumber(number);
    }

    public Employee()
    {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.date = date;
    }

    //create a setter with all the stuff in it and then use the setter in the constructor

    public void setEmployeeNumber(String num)
    {
        //String num = " ";
        Scanner scanner = new Scanner(System.in);

        char[] numArray; 
        numArray = num.toCharArray();

        while(!Character.isDigit(numArray[0]) || !Character.isDigit(numArray[1]) || !Character.isDigit(numArray[2]) || !Character.isLetter(numArray[3]))
        {
            System.out.print("Enter a valid employee number (3 digits, followed by a Letter): ");

            num = scanner.nextLine();
            numArray = num.toCharArray();
        }

        employeeNumber = num;
    }

    //getters
    
    public String getEmployeeName()
    {
        return employeeName;
    }

    public String getEmployeeNumber()
    {
        return employeeNumber;
    }

    public int getHireDate()
    {
        return date;
    }
}
