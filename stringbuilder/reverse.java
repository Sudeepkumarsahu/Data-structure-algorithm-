class reverse {
    public static void main(String ar[]){
        StringBuilder sb = new StringBuilder("S");
        sb.append('u');
        sb.append('d');
        sb.append('e');
        sb.append('e');
        sb.append('p');
        System.out.println(sb);
   
        for(int i=0; i<sb.length()/2;i++)
        {
            int front = i;
            int back = sb.length()-1-i;

            char frontchar  = sb.charAt(front);
            char backchar  = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
}