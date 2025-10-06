class O1tri {

    public static void main(String ar[]) {
        int n = 5, i, j;
        for (i = 1; i <= n; i++) // row
        {
            for (j = 1; j <= i; j++)// column
            {
                if ((i + j) % 2 == 0)
                    System.out.print(1 + " ");
                else {
                    System.out.print(0 + " ");

                }
            }
            System.out.println("");
        }
    }
}
