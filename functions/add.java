import java.util.Scanner;

class add {
    public static int result(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Hello, " + name + "! Enter two integers to add:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = result(a, b);

        System.out.println("The sum of " + a + " and " + b + " is: " + r);
        sc.close(); // Close the scanner to avoid resource leak
    }
}
