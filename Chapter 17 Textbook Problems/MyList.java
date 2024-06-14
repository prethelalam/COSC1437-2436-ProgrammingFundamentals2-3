import java.util.ArrayList;

public class MyList<T extends Number & Comparable<T>> {
    // Write a generic class named MyList, with a type parameter T. 
    // The type parameter T should be constrained to an upper bound: 
    // the Number class. The class should have as a field an ArrayList of T. 
    // Write a public method named add, which accepts a parameter of type T. 
    // When an argument is passed to the method, it is added to the ArrayList. 
    // Write two other methods, largest and smallest, which return the largest and smallest values in the ArrayList.

    private ArrayList<T> list;

    //cosntructor
    public MyList()
    {
        list = new ArrayList<>();
    }

    public void add(T number)
    {
        list.add(number);
    }

    public T largest()
    {
        T highest = list.get(0);

        for(T index: list)
        {
            if(index.compareTo(highest) > 0)
            {
                highest = index;
            }
        }
        return highest;
    }

    public T smallest()
    {
        T lowest = list.get(0);

        for(T index: list)
        {
            if(index.compareTo(lowest) < 0)
            {
                lowest = index;
            }
        }
        return lowest;
    }
}
