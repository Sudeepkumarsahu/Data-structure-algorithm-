class insertion{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String ar[])
    {
        int arr[] = {633,2,1,1,6,5,7,8,4,3,1,2,5,9,6};
        //insertion sort
        //time complexity O(n^2)
        for(int i=1;i<arr.length;i++)
        {
         int current = arr[i];
         int j=i-1;
         while(j>=0 && current < arr[j]){
            arr[j+1] = arr[j];
            j--;
         }
         arr[j+1] = current;
        }
        printArray(arr);
    }
}