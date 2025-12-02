public class stringBuilder {
    public static void main(String[] args) {
        
        // Using String (slow)
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str = str + i; // creates new String object each time
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time using String: " + (endTime - startTime) + " ms");

        // Using StringBuilder (fast)
        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i); // modifies same object
        }
        String result = sb.toString();
        long endTime2 = System.currentTimeMillis();
        System.out.println("Time using StringBuilder: " + (endTime2 - startTime2) + " ms");
    }
}
