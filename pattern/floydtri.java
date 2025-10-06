class floydtri {

    public static void main(String ar[]) {
        int n = 4, i, j, temp = 1;
        for (i = 1; i <= n; i++) // row
        {
            for (j = 1; j <= i; j++)// column
            {

                System.out.print(temp + " ");
                temp++;
            }
            System.out.println("");
        }
    }
}
