public class EmployeeTest {
    public static void main(String[] args) {

    //number 1
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "\tProgrammer");
        Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        System.out.println("Name:\t\tID Number\t\tDepartment\t\tPosition");
        System.out.println("-------------------------------------------------------------------------------");
        displayEmployeeInformation(employee1);
        displayEmployeeInformation(employee2);
        displayEmployeeInformation(employee3);

    //*************************************************************************************************************

    //number 2
        



    }    

    //number 1
    public static void displayEmployeeInformation(Employee employee)
    {
        System.out.println(employee.getName() + "\t" + employee.getIdNumber() + "\t\t\t" + employee.getDepartment() + "\t\t" + employee.getPosition());

    //*************************************************************************************************************

    //number 2
        
    }
}
