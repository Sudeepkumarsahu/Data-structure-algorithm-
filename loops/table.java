import java.util.Scanner;
class table {
    public static void main(String ar[])
    {
        int s=0;
        System.out.println("enter a number");
        Scanner sc  = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }
}
