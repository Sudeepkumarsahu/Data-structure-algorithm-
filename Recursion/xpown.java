
class xpown  {
    // stack height : logn
   public static int calcppower(int x,int n){
    if(n==0){
        return 1;
    }
    if(x==0){
        return 0;
    }
   if(n%2==0){
    return calcppower(x, n/2)* calcppower(x, n/2);
   }
   else{
    return calcppower(x, n/2)* calcppower(x, n/2)*x;
   }
   } 
   public static void main(String ar[])
   {
    int a=2;
    int b=10;
    int ans = calcppower(a,b);
    System.out.println(ans);
   }
}
