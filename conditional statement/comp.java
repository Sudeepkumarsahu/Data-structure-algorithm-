import java.util.Scanner;
class comp{
    public static void main(String ar[])
    {
        int a;
        Scanner ob = new Scanner (System.in);
        a=ob.nextInt();
        int b=ob.nextInt();
        if(a>b){
            System.out.println("a is grather");
        }
        else if(a<b){
            System.out.println("a is smaller");
        }
        else{
            System.out.println("both are equal");
        }
        ob.close();
    }

}