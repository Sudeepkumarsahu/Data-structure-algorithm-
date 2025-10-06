public class countWordLength {
    public static void main(String[] args) {
        String s = "i am a student from bansal           ";
        s=s.trim();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 32) {
                c++;
            } else {
                System.out.print(c + " ");
                c = 0;
            }
        }
        System.out.print(c + " ");
    }
}
