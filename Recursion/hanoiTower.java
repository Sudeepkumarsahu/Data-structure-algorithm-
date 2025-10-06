class hanoiTower{
    //time complexity : O(2^n-1) or  O(2^n)
    public static void TowerOfHanoi(int n,String source ,String helper ,String destination){
        if(n==1){

            System.out.println("transfer disk "+n+" from "+source +" to "+destination);
            return;
        }
        TowerOfHanoi( n-1, source , destination ,helper );
        System.out.println("transfer disk "+n+" from "+source+ " to "+destination);
        TowerOfHanoi(n-1, helper, source, destination);
    }   
public static void main(String ar[])
{
    int n=1;
    TowerOfHanoi(n,"S","H","D");
}
}