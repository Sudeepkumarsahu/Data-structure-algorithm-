 class count {
    public static void printcount(int x){
        if(x==0){
            return;
        }
        System.out.println(x);
        printcount(x-1);
        
    }
   public static void main(String ar[])
   {
    int n=10;
    printcount(n);
   }
}
