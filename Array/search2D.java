import java.util.Scanner;

class search2D {
    public static void main(String ar[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter no. of rows");
        int n = ob.nextInt();
        System.out.println("enter no. of columns");
        int m = ob.nextInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = ob.nextInt();
            }
        }
        System.out.println("enter no.for seaching");
        int x = ob.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("number fount at index : (" + (i + 1) + "," + (j + 1) + ")");
                }
            }
        }
        ob.close();
    }
}
