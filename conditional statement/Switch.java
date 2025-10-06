import java.util.Scanner;
class Switch{
    public static void main(String ar[])
    {
        int a;
        Scanner ob = new Scanner (System.in);
        System.out.println("enter 1 to 5 number");
        a=ob.nextInt();
        
        switch(a){
            case 1:
            System.out.println("one");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("three");
            break;
            case 4:
            System.out.println("four");
            break;
            case 5:
            System.out.println("five");
            break;
            default:
            System.out.println("invalid number");

        }
        ob.close();
    }

}