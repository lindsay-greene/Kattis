import java.io.*;
import java.util.*;

public class backspace {
    public static void main(String[] args) throws IOException {
         Scanner input = new Scanner(System.in);
         String s = input.next();
         char[] chars = s.toCharArray();
         int count = 0;
         for(int i = chars.length-1; i >= 0; i--) {
             if(chars[i] == ('<')) {
                 chars[i] = ' ';
                 count++;
             } else if(count > 0) {
                 chars[i] = ' ';
                 count--;
             }
         }
         String ans = new String(chars);
         System.out.println(ans.replaceAll(" ", ""));
         input.close();
    }
}
