// move all "X" to the end of the string...

public class recursion_10 {
    public static void move_allX (int ind, String str, int count, String newString) {
        if (ind==str.length()) {
            for(int i=0; i<count; i++) {
                newString += "X";
            }
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(ind);
        if (currchar == 'X') {
            count++;
            move_allX(ind+1, str, count, newString);
        } else {
            newString += currchar;
            move_allX(ind+1, str, count, newString);
        }
    }
    public static void main (String[] args) {
        String str = "aXbcXXd";
        move_allX(0, str, 0, "");
    }
}
