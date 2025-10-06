/*clear the 3rd bit(position = 2) of a nnumber n.(n=0101)
 bit mask 1<<i
 operation AND with NOT of BM
 */

 class clearbit {
    public static void main(String ar[])
    {
        int n=5; //0101
        int pos  = 2;
        int bitmass = 1<<pos;
        
        int a = ~(bitmass) & n;
      System.out.println(a);
    }
}
