import java.util.ArrayList;
import java.util.Scanner;

public class Chapter17
{
    public static void main(String[] args) {
        //1. *******************************************
        MyList<Integer> list = new MyList<>();

        list.add(10);
        list.add(20);
        list.add(40);

        System.out.println("Largest value is: " + list.largest());
        System.out.println("Smallest value is: " + list.smallest());

        //2. *******************************************
        MyListModification<Integer> list = new MyListModification<>();

        list.add(10);
        list.add(20);
        list.add(40);

        System.out.println("Largest value is: " + list.largest());
        System.out.println("Smallest value is: " + list.smallest());

        MyListModification<String> nameList = new MyListModification<>();

        nameList.add("John");
        nameList.add("Kathy");
        nameList.add("Tim");

        System.out.println("Largest value is: " + nameList.largest());
        System.out.println("Smallest value is: " + nameList.smallest());

        //3. *******************************************
        String[] names = {"bob", "tim", "zoey", "jim", "sam"};

        //dipslay the names
        for(int i = 0; i < names.length; i++)
        {
            System.out.println("Array values: " + names[i]);
        }

        //sorting the array
        GenericObjectInsertionSorter sort = new GenericObjectInsertionSorter();
        sort.insertionSorter(names);

        //diplsay sorted names
        for(int j = 0; j < names.length; j++)
        {
            System.out.println("Sorted array values: " + names[j]);
        }

        //5. *******************************************
        String[] names = {"bob", "tim", "zoey", "jim", "sam"};

        System.out.println("What value are you searching for: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        //sort the array
        GenericObjectInsertionSorter sort = new GenericObjectInsertionSorter();
        sort.insertionSorter(names);

        //search the array
        GenericObjectBinarySearcher search = new GenericObjectBinarySearcher();
        int position = search.genericBinarySearch(names, name);

        System.out.println("The name you are searching for is in index " + position + 1);
    }
}