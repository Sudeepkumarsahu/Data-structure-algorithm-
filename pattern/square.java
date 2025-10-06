import java.util.Scanner;
class square {
    public static void main(String ar[])
    {
        
        System.out.println("enter a number");
        Scanner sc  = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int v=1; v<=n; v++)
            {
                System.out.print("*");

            }
            System.out.println("");
        }
    }
}