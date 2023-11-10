public class Procedure {
    private String procedureName;
    private String date;
    private String doctorName;
    private double cost;

    //constructor
    public Procedure(String procedureName, String date, String doctorName, double cost)
    {
        setProcedure(procedureName);
        setDate(date);
        setDoctorName(doctorName);
        setCost(cost);
    }

    //mutators
    public void setProcedure(String procedure)
    {
        procedureName = procedure;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public void setDoctorName(String docName)
    {
        doctorName = docName;
    }

    public void setCost(double money)
    {
        cost = money;
    }

    //accessors
    public String getProcedure()
    {
        return procedureName;
    }

    public String getDate()
    {
        return date;
    }

    public String getDoctorName()
    {
        return doctorName;
    }

    public double getCost()
    {
        return cost; 
    }
}
