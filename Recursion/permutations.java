//print all permutations of a string 
// "abc"

//time complexity : O(n!)
class permutations {
    public static void printperm(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            //"abc" -> "ab"
            String newStr = str.substring(0, i)+str.substring(i+1);printperm(newStr, permutation+currChar);
        }
    } 
    public static void main(String sr[])
    {
        String str = "abc";
        printperm(str, "");
    }
}
