public class Employee {
    
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee(String name1, int idNum, String department1, String position1)
    {
        name = name1;
        idNumber = idNum;
        department = department1;
        position = position1;
    }

    public Employee(String name1, int idNum)
    {
        name = name1;
        idNumber = idNum;
        department = "";
        position = "";
    }

    public Employee()
    {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    //mutators

    public void setName(String name1)
    {
        name = name1;
    }

    public void setIdNum(int idNum)
    {
        idNumber = idNum;
    }

    public void setDepartment(String department1)
    {
        department = department1;
    }

    public void setPosition(String position1)
    {
        position = position1;
    }

    //Accessors

    public String getName()
    {
        return name;
    }

    public int getIdNumber()
    {
        return idNumber;
    }

    public String getDepartment()
    {
        return department;
    }

    public String getPosition()
    {
        return position; 
    }
}
