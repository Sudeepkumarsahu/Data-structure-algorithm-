 class revString {
    public static void printRev(String str,int idx)
    {
        if(idx == 0)
        {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
   public static void main(String ar[]) 
   {
    String str = "sudeep";
    printRev(str, str.length()-1);
   }
}
