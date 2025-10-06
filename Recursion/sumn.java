class sumn {
    public static void printsum(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printsum(i+1, n, sum);
       System.out.println(i);
       System.out.println(n);
        
    }
   public static void main(String ar[])
   {
    int n=10;
    printsum(1, n,0);
   }
}
