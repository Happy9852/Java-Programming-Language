public class char_at {
    public static void main (String[] args) {
        String full_Name = "Sai";
        System.out.println("full_Name is: " + full_Name);
        System.out.println("The string length is: "+full_Name.length());

        for (int i=0; i<full_Name.length(); i++) {
            System.out.println(full_Name.charAt(i));
        }
    }
}