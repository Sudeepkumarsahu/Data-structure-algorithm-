import java.util.HashSet;
class uniquesubseq {

    public static void Subsequence(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        // to be (aana chahta hai)
        Subsequence(str, idx + 1, newString + currChar,set);

        // or not to be (aana nahi chahta )
        Subsequence(str, idx + 1, newString,set);

    }

    public static void main(String ar[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();//is datastructure me unique item hote hai
        Subsequence(str, 0, "",set);
    }
}
