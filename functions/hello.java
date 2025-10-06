import java.util.Scanner;

class hello{
    public static void printMyName(String name)
    {
        System.out.println(name);
        return;
    }
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        hello.printMyName(name);
        printMyName(name);
    }
}