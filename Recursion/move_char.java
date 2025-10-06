// move all 'x' to the end of string
class move_char {
    public static void moveAllX(String str,int idx,int count,String newString)
{
    if(idx==str.length()){
        for(int i=0;i<count;i++)
        {
            newString += 'X';
        }
        System.out.println(newString);
        return;
    }

    char currChar = str.charAt(idx);
    if(currChar=='X')
    {
        count++;
        moveAllX(str, idx+1, count, newString);
    }
    else{
        newString += currChar;
        moveAllX(str, idx+1, count, newString);
    }
}
public static void main(String ar[]){
    String str = "axbcxxd";
    moveAllX(str, 0, 0, "");
}
}
