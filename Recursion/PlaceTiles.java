//Place tiles of size 1*m in a floor of size n*m
public class PlaceTiles {
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //bertically place
        int verticalPlace = placeTiles(n-m, m);
        //horizontally place
        int horizontalPlace = placeTiles(n-1, m);

        return verticalPlace + horizontalPlace;
    }
    public static void main(String ar[]){
int n=4,m=2;
System.out.println(placeTiles(n, m));
    }
}
