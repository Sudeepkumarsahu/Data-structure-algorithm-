class Subsequences {
    // time complexity = 2^(n+1) -1
    // O(2^n)

    public static void Subsequence(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // to be (aana chahta hai)
        Subsequence(str, idx + 1, newString + currChar);

        // or not to be (aana nahi chahta )
        Subsequence(str, idx + 1, newString);

    }

    public static void main(String ar[]) {
        String str = "abc";
        Subsequence(str, 0, "");
    }
}
