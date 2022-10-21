import java.util.Scanner; // import scanner

public class SquareCalculator {
    public static void main(String[] args) {
        //this program will calculate perimeter and area of rectangle
        //assign the value of variable width and height

        // create scanner object
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter width and height to calculate perimeter and area of rectangle");

        // read the width
        System.out.println ("Enter width : ");
        double width = reader.nextDouble();

        // read the height
        System.out.println ("Enter height : ");
        double height = reader.nextDouble();

        System.out.println("Width = " + width);
        System.out.println("Height = " + height);

        //calculate perimeter
        double perimeter = (width + height) * 2;
        //calculate area
        double area = (width * height);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The area of the rectangle is " + area);
    }
}
