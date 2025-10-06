
import java.util.Scanner;;
 class updatebit {
    public static void main(String ar[])
    {
        Scanner ob= new Scanner(System.in);
        int oper = ob.nextInt();
        int n=5; //0101
        int pos  = 1;
        int bitmass = 1<<pos;
        if(oper ==1){
            // set     
            int newnumber = bitmass|n;
          System.out.println(newnumber);
        } 
        else{
            int newbitmass = ~(bitmass);
            int newnumber = newbitmass & n;
            System.out.println(newnumber);
        }
      ob.close();
    }
}
