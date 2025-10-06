class comparision {
    public static void main(String ar[]) {
        String one = "sudeep";
        String two = "sahu";
        // 1 s1 > s2 :+ve value
        // 1 s1 = s2 :0
        // 1 s1 < s2 :-ve value
        if (one.compareTo(two) == 0) {
            System.out.println("strings are equals");
        } else if (one.compareTo(two) < 0) {
            System.out.println("first string is small");
        } else {
            System.out.println("first string is greater");
        }
    }
}
