
// import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // Prompt user for width and height of the rectangle
        // System.out.print("Enter the width of the rectangle: ");
        // int width = scanner.nextInt();
        // System.out.print("Enter the height of the rectangle: ");
        // int height = scanner.nextInt();
int height = 4;
int width = 5;
        // Loop through each row
        for (int i = 1; i <= height; i++) {
            // Loop through each column
            for (int j = 1; j <= width; j++) {
                // Print '*' for the first and last row, or first and last column
                if (i == 1 || i == height || j == 1 || j == width) {
                    System.out.print("*");
                } else {
                    // Print space for hollow part
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner
        // scanner.close();
    }
}
