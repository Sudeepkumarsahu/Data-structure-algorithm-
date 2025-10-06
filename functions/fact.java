import java.util.Scanner;

class fact {
    public static void calculateFactorial(int x) {

        if (x < 0) {
            System.out.println("invalid number");
            return;
        }
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f = f * i;
        }
        System.out.println(f);
        return;
    }

    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateFactorial(n);
    }
}
