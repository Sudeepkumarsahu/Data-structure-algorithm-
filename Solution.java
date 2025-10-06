class Solution {
  public static int getSum(int a, int b) {
    while (b != 0) {
      int c = (int) (a & b);
      a = a ^ b;
      b = (int) c << 1;
    }
    return a;
  }

  public static void main(String[] args) {
    String[] arr = { "1", "2", "3", "34" };
    int s = 0;
    for (int i = 0; i < arr.length; i++) {
      s += Integer.parseInt((arr[i])+"");
    }
    System.out.println(s);
  }
}