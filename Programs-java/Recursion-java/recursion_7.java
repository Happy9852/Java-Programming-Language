//write a prgram to print a reverse the array 

public class recursion_7 {
    public static void reverse (int idx, String str) {
        if (idx==0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverse(idx-1, str);
    }
    public static void main (String[] args) {
        String str = "Laveti_Sai";
        reverse(str.length()-1,str);
    }
}
