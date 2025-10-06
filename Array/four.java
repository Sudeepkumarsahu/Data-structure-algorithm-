import java.util.Scanner;

class four {
   public static void main(String ar[]) 
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array");
    int size  = sc.nextInt();
    int arr[] = new int [size];
    for(int i=0; i<size; i++)
    {
       arr[i]= sc.nextInt();
    }
    System.out.println("enter number for searching");
    int x= sc.nextInt();
    for(int i=0; i<size; i++)
    {
        if(arr[i]==x){

            System.out.print("number found at index "+i);
        }
    }
    sc.close();
   }
}