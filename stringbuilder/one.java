class one {
    public static void main(String ar[]) {
        StringBuilder sb = new StringBuilder("sudeep");
        System.out.println(sb);

        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'm');
        System.out.println(sb);

        sb.insert(0, 's');

        System.out.println(sb);

        sb.insert(3, 'd');

        System.out.println(sb);

        sb.delete(1, 2);
        sb.delete(2, 3);
        System.out.println(sb);

    }
}
