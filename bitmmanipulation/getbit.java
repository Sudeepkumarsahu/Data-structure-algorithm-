/*get the 3rd bit(position = 2) of a nnumber n.(n=0101)
 bit mask 1<<i
 operation AND
 */

class getbit {
    public static void main(String ar[])
    {
        int n=5; //0101
        int pos  = 3;
        int bitmass = 1<<pos;
        int a = bitmass & n;
        if(a==0){
            System.out.println("bit is zero");
        }
        else{
            System.out.println("bit is one");
        }
    }
}
