import java.util.Scanner;
class ifelse{
    public static void main(String ar[])
    {
        int a;
        Scanner ob = new Scanner (System.in);
        a=ob.nextInt();
        if(a>18){
            System.out.println("adult");
        }
        else{
            System.out.println("not adult");
        }
        ob.close();
    }

}