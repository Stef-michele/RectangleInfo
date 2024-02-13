import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        //scanner in
        Scanner in = new Scanner(System.in);
        //defining variables
        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        boolean validInput = false;
        String trash = "";
        // collect inputs and bulletproof
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) { //only allowing number input
                width = in.nextDouble();//scanner input
                in.nextLine();  // Clears the newline from the buffer

                System.out.print("Enter the height of the rectangle: ");
                if (in.hasNextDouble()) { //only allowing number input
                    height = in.nextDouble();//scanner input
                    in.nextLine();  // Clears the newline from the buffer
                    validInput = true;  // Valid input, end the loop
                } else { //returns error to user for bad input height
                    trash = in.nextLine();
                    System.out.println("You entered an invalid height, enter a number not " + trash);
                }
            } else { //returns error for bad input width
                trash = in.nextLine();
                System.out.println("You entered an invalid width, enter a number not " + trash);
            }
        } while (!validInput); //holds loop if input isn't valid in if statements

        // Calculate and print area, perimeter, and diagonal
         area = width * height;
         perimeter = 2 * (width + height);
         diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        // Print Data
        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
        System.out.println("Diagonal of Rectangle: " + diagonal);
    }
}