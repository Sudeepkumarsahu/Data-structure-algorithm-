import java.util.Scanner;

class STRing {
    public static void main(String ar[]) {
        // Scanner ob = new Scanner(System.in);
        // String s= ob.nextLine();
        // System.out.println(s);
        // concatenation
        String firstName = "sudeep";
        String lastName = "sahu";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}