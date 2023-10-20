public class PersonalData {
    private String name;
    private String address;
    private int age;
    private int number;

    public PersonalData(String name, String address, int age, int number)
    {
        this.name = name;
        this.address = address;
        this.age = age;
        this.number = number;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public int getAge()
    {
        return age;
    }

    public int getNumber()
    {
        return number;
    }
}
