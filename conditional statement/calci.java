import java.util.Scanner;
class calci
{
    public static void main(String ar[])
    {
        int a;
        Scanner ob = new Scanner (System.in);
        System.out.println("-------------------------------------CALCULATOR-------------------------------------");
        System.out.println("ENTER FIRST NUMBER");
        a=ob.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int b=ob.nextInt();
        System.out.println("press\n1=>sum\n2=>subtract\n3=>multiply\n4=>division\n5=>reminder");
        int c=ob.nextInt();
        switch(c){
            case 1:

            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            System.out.println((float)a/b);
            break;
            case 5:
            System.out.println(a%b);
            break;
            default:
            System.out.println("invalid expression");

        }
        ob.close();
    }

}