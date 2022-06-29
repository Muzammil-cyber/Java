import java.util.Arrays;
import java.util.Date;


public class Main {
    public static void main(String[] args) {

        // Primitive Data types
        byte age = 55; // You can store a character as well
        int subscriber = 1_234_567_899; // Using underScore(_) as separator
        long viewCount = 21345497541231564L; // Using L or l as a suffix to represent its long data type
        float price = 16.45f; // Using F or f as a suffix to represent its float data type
        char letter = 'a'; // use single quotation
        boolean agreed = false;
        final float PI = 3.14F; // Constant can't change its value

        // Reference Data types
        Date now = new Date();
        String message = new String("Hello World");
        // OR
        String message2 = "Hey there";
        //message.startsWith("H") Returns Boolean
        //message.endsWith("H") Returns Boolean
        //message.length() Returns length of string
        //message.indexOf("H") Returns with index of character starts with Zero if not founds -1
        //message.replace("H","*")
        //message.toLowerCase()
        //message.trim() Gets rid of white spaces in beginning and end
        //int[] ages = new int[5];  // 5 represents how many blocks we need in array OR
        int[] ages = {1,2,0,0,0};
        Arrays.sort(ages);
        System.out.println(ages); // Returns [I@372f7a8d
        System.out.println(Arrays.toString(ages));
        int[][][] cord = new int[2][4][3];
        System.out.println(Arrays.deepToString(cord));
        int[][] matrix  = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(matrix));




        System.out.println(now);
        System.out.println(message + message2);

        System.out.println(age);
    }

}