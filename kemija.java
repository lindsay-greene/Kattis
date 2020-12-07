import java.io.*;
import java.util.*;

public class kemija {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = input.readLine();
        String[] words = line.split(" ");
        String[] decoded = new String[words.length];
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            String decode = "";
            for(int j = 0; j < word.length(); j++) {
                if(vowels.contains(word.charAt(j))) {
                    decode += word.charAt(j);
                    j += 2;
                } else {
                    decode += word.charAt(j);
                }
            }
            decoded[i] = decode;
        }
        String ans = "";
        for(int i = 0; i < decoded.length; i++) {
            if(i < decoded.length-1) ans += (decoded[i] + " ");
            else ans += decoded[i];
        }
        System.out.println(ans);
    }
}
