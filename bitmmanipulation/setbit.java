/*set the 2nd bit(position = 1) of a nnumber n.(n=0101)
 bit mask 1<<i
 operation OR
 */

 class setbit {
    public static void main(String ar[])
    {
        int n=5; //0101
        int pos  = 1;
        int bitmass = 1<<pos;
        int newnumber = bitmass | n;
       System.out.println(newnumber);
    }
}
