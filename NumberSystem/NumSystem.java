public class NumSystem {
    public static void BinToDeci(int BinNum){
        int power = 0;
        int t =BinNum;
        int decimal = 0;
        while (BinNum >0) {
            int lastDigit = BinNum % 10;
            decimal = decimal + (int )(lastDigit * Math.pow(2, power));
            power++;
            BinNum /= 10;
        }
        System.out.println("Decimal of "+ t +" = " +decimal);
    }
    public static void DeciToBin(int DeciNum){
        int t= DeciNum;
        int BinNum =0;
        int pow =0;
        while (DeciNum >0) {
            int rem = DeciNum % 2;
            BinNum = BinNum + rem * (int )(Math.pow(10, pow));
            pow++;
            DeciNum /= 2;
        }
        System.err.println("Binary of "+t+" = "+BinNum);
        
    }
    public static void main(String[] args) {
        BinToDeci(10101);
        DeciToBin(10);
    }
}
