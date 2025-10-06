 import java.util.Scanner;
 class product {
    public static int calculateProduct(int x,int y)
    {
        int p= x*y;
        return p;
    }
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = calculateProduct(a, b);
        System.out.println(result);
    }
}