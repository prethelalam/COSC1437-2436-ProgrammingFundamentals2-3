public class RoomCarpet {
    private RoomDimension size;       
    private double carpetCost;
    
    public RoomCarpet(RoomDimension dim, double cost)
    {
        size = dim;
        carpetCost = cost;
    }

    public double getTotalCost()
    {
        return size.getArea() * carpetCost;     //here we are using size as the object name for RoomDimension
    }

    public String toString()
    {
        return "The cost of the carpet will be $" + getTotalCost();
    }
}
