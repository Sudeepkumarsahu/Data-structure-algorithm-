class fibonacci {
    public static void calcfibonacci(int a, int b ,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        calcfibonacci(b, c, n-1);
    }
public static void main(String r[])    
{
int a=0,b=1;
int n=7;
System.out.println(a);
System.out.println(b);
calcfibonacci(a, b, n-2);
}
}
