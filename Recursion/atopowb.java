class atopowb  {
    // stack height : n
   public static int calcppower(int x,int n){
    if(n==0){
        return 1;
    }
    if(x==0){
        return 0;
    }
    int xpownm1 = calcppower(x,n-1);
    int xpown = x*xpownm1;
    return xpown;
   } 
   public static void main(String ar[])
   {
    int a=2;
    int b=10;
    int ans = calcppower(a,b);
    System.out.println(ans);
   }
}
