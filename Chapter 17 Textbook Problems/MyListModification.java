import java.util.ArrayList;

public class MyListModification<T extends Comparable<T>> {
    private ArrayList<T> list;

    public MyListModification()
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
