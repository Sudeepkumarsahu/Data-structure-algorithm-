class rect {
    public static void main(String ar[])
    {
        int n=4,m=5,i,j;
        for(i=1;i<=n;i++) //row
        {
        for(j=1;j<=m;j++)//column
        {
            //cell (i,J)
            if(i==1 || i==n || j==1 || j==m)
            System.out.print("*");
            else{
                System.out.print(" ");
            }
        }
        System.out.println("");
     }
    }
}