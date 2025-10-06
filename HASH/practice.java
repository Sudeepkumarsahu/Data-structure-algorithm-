import java.util.HashMap;
import java.util.HashSet;

public class practice {
    public static void majorityElement(int nums[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i =0 ;i < n ; i++){ 
        if(map.containsKey(nums[i])){//key exist
            map.put(nums[i], map.get(nums[i]) + 1); //update freq
        }else{ 
            map.put(nums[i], 1); //set new freq 1
        }

        
        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }
}
public static int union(int arr1[] , int arr2[]){
    HashSet<Integer> set = new HashSet<>();
    for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
    }
    for(int i=0;i<arr2.length;i++){
        set.add(arr2[i]);
    }
    return set.size();
}
public static int intersection(int arr1[] , int arr2[]){
    int count =0;
    HashSet<Integer> set = new HashSet<>();
    for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
    }
    for(int i=0;i<arr2.length;i++){
        if(set.contains(arr2[i])){
            count++;
            set.remove(arr2[i]);
            System.out.print(" "+arr2[i]);
        }
        
    }
    return count;
}
    public static void main(String[] args) {
        int nums[] = {1,3,2,5,1,3,1,5,1};
        majorityElement(nums);

        int num1[] = {3,6,9};
        int num2[] = {1,3,5,9,8,0,6,6};
      System.out.println("Union of both array is "+union(num1, num2));
      System.out.println("\nintersection of both array is "+intersection(num1, num2));
    }
}
