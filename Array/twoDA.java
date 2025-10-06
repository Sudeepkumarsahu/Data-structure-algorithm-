import java.util.Scanner;

class twoDA {
    public static void main(String ar[])    
    {
        Scanner ob  = new Scanner(System.in);
        System.out.println("enter no. of rows");
        int n=ob.nextInt();
        System.out.println("enter no. of columns");
        int m=ob.nextInt();
        int matrix[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0; j<m;j++){
                matrix[i][j]=ob.nextInt();
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0; j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        ob.close();
    }
}
