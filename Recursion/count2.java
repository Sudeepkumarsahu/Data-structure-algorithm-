class count2 {
    public static void printcount(int x){
        if(x==11){
            return;
        }
        System.out.println(x);
        printcount(x+1);
        
    }
   public static void main(String ar[])
   {
    int n=1;
    printcount(n);
   }
}
