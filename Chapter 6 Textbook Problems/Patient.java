public class Patient {
    private String fullName;
    private String address;
    private String phoneNum;
    private String emergencyName;
    private String emergencyNum;

    //constructor
    public Patient(String fullName, String address, String phoneNum, String emergencyName, String emergencyNum)
    {
        setName(fullName);
        setAddress(address);
        setPhoneNum(phoneNum);
        setEmergencyName(emergencyName);
        setEmergencyNum(phoneNum);
    }
    //mutators

    public Patient(String string, String string2, String string3, double d) {
    }

    public void setName(String name)
    {
        fullName = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setPhoneNum(String number)
    {
        phoneNum = number;
    }

    public void setEmergencyName(String eName)
    {
        emergencyName = eName;
    }

    public void setEmergencyNum(String eNum)
    {
        emergencyNum = eNum;
    }

    //accessors

    public String getName()
    {
        return fullName;
    }

    public String getAddress()
    {
        return address;
    }

    public String getPhone()
    {
        return phoneNum;
    }

    public String getEmergencyName()
    {
        return emergencyName;
    }

    public String getEmergencyNumber()
    {
        return emergencyNum;
    }

}

