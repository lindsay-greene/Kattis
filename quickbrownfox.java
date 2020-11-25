import java.io.*;
import java.util.*;

public class quickbrownfox {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0; i < n; i++) {
            int[] count = new int[26];
            String phrase = input.nextLine();
            phrase = phrase.toLowerCase();
            for(int j = 0; j < phrase.length(); j++) {
                int ascii = (int)phrase.charAt(j);
                if(ascii >= 97 && ascii <= 122) {
                    count[ascii - 'a'] = 1;
                }
            }
            String missing = "";
            for(int j = 0; j < count.length; j++) {
                if(count[j] == 0) missing += (char)(j + 'a');
            }
            if(missing.length() == 0) System.out.println("pangram");
            else System.out.println("missing " + missing);
        }
    }
}
