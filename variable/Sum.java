import java.util.Scanner;
class Sum
{
    public static void main(String ar[])
    {
        Scanner ob = new Scanner(System.in);
        int a,b,c;
        a= ob.nextInt();
        b=ob.nextInt();
        c= a+b;
        System.out.println(c);
        ob.close();
    }
}