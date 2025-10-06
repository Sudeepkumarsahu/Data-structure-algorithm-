

class palindromic{
    public static void main(String ar[])
    {
        int n=7;
        for(int i=1; i<=n; i++)   
        {
            //spaces
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            // first half numbers
           /*1
            21
           321
          4321
         54321
        654321
       7654321*/
            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
            }
            // second half number
            for(int j=2; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    }