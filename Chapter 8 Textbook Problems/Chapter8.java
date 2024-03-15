import java.util.Scanner;

public class Chapter8{
    public static void main(String[] args) {
        //1

        // System.out.printf("The area of a circle with a radius of 3 is %.2f\n", Area.getArea(3));
        // System.out.printf("The area of a rectangle with a length of 2 and a width of 4 is %.1f\n", Area.getArea(2, 4));
        // System.out.printf("The area of a trapezoid with a base lengths of 3 and 4 is %.1f\n", Area.getArea(3, 4, 5));

        //3 ******************************************************************************

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter the dimensions of a room (enter 1 number followed by pressing enter and another number): ");
        // double dimension1 = scanner.nextDouble();
        // double dimension2 = scanner.nextDouble();

        // System.out.println("What is the price per sqaure foot of the desired carpeting? ");
        // double price = scanner.nextDouble();

        // RoomDimension roomDimension = new RoomDimension(dimension1, dimension2);
        // RoomCarpet roomCarpet = new RoomCarpet(roomDimension, price);

        // System.out.println(roomCarpet.toString());

        //notice how you did not do roomCarpet.getTotalCost(), its because the toString method takes care of that

        //double area = roomDimension.getArea();    //notice how you dont need this line of code either, its because this will happen regardless when the object is created

        //4 ******************************************************************************
        // Scanner scanner = new Scanner(System.in);

        // //ask user to enter dimensions for 2 tracts of land
        // System.out.println("Enter the dimensions for the first tract of land. (enter the length, press enter, then enter the width).");
        // double length1 = scanner.nextDouble();
        // double width1 = scanner.nextDouble();

        // System.out.println("Enter the dimensions for the second tract of land. (enter the length, press enter, then enter the width).");
        // double length2 = scanner.nextDouble();
        // double width2 = scanner.nextDouble();

        // //display area of each tract of land
        // LandTract landTract1 = new LandTract(length1, width1);
        // LandTract landTract2 = new LandTract(length2, width2);

        // System.out.println(landTract1.toString());
        // System.out.println(landTract2.toString());

        // //indicate wheather the tracts are of equal size 
        // boolean status = landTract1.equals(landTract2.getArea());

        // System.out.println("Both land tracts are the same size: " + status);

        //5 ******************************************************************************

        //this problem just wanted a class

        //6 ******************************************************************************

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int monthNum = scanner.nextInt();
        Month month = new Month(monthNum);
        month.setMonthNumber(monthNum);

        System.out.print("Enter a day (that corresponds with the month): ");
        int day = scanner.nextInt();

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        Date date = new Date(monthNum, day, year);

        System.out.println(date.toString());
        

        //9 **********************************************************************
        //come back too
    }
}