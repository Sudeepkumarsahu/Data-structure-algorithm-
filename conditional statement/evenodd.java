import java.util.Scanner;
class evenodd
{
    public static void main(String ar[])
    {
        int a;
        Scanner ob = new Scanner (System.in);
        a=ob.nextInt();
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        ob.close();
    }

}