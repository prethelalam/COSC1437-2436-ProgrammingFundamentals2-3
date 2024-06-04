public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;

    public RetailItem(String description, int unitsOnHand, double price) throws InvalidPrice, InvalidUnits
    {
        if(price < 0)
        {
            throw new InvalidPrice("Price cannot be negative.");
        }
        else
        {
            this.price = price;
        }

        if(unitsOnHand < 0)
        {
            throw new InvalidUnits("Units cannot be negative.");
        }
        else
        {
            this.unitsOnHand = unitsOnHand;
        }

        this.description = description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setUnits(int unitsOnHand)
    {
        this.unitsOnHand = unitsOnHand;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getDescription()
    {
        return description;
    }

    public int getUnits()
    {
        return unitsOnHand;
    }

    public double getPrice()
    {
        return price;
    }
}
