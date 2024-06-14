import java.util.ArrayList;

public class Chapter17
{
    public static void main(String[] args) {
        //1. *******************************************
        // MyList<Integer> list = new MyList<>();

        // list.add(10);
        // list.add(20);
        // list.add(40);

        // System.out.println("Largest value is: " + list.largest());
        // System.out.println("Smallest value is: " + list.smallest());

        //2. *******************************************
        // MyListModification<Integer> list = new MyListModification<>();

        // list.add(10);
        // list.add(20);
        // list.add(40);

        // System.out.println("Largest value is: " + list.largest());
        // System.out.println("Smallest value is: " + list.smallest());

        // MyListModification<String> nameList = new MyListModification<>();

        // nameList.add("John");
        // nameList.add("Kathy");
        // nameList.add("Tim");

        // System.out.println("Largest value is: " + nameList.largest());
        // System.out.println("Smallest value is: " + nameList.smallest());

        //3. *******************************************
        String[] names = {"bob", "tim", "zoey", "jim", "sam"};

        //dipslay the names
        for(int i = 0; i < names.length; i++)
        {
            System.out.println("Array values: " + names[i]);
        }

        //sorting the array
        GenericObjectInsertionSorter.insertionSorter(names);

        //diplsay sorted names
        for(int j = 0; j < names.length; j++)
        {
            System.out.println("Sorted array values: " + names[j]);
        }

        //4. *******************************************
    }
}