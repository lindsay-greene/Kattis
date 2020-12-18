import java.io.*;
import java.util.*;

public class secretmessage {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        for(int i = 0; i < cases; i++) {
            String message = input.next();
            int j = 0;
            while(j * j < message.length()) j++;
            char[][] encoded = new char[j][j];
            int additional = (j * j) - message.length();
            for(int k = 0; k < additional; k++) message+= "*";
            int f = 0;
            for(int k = 0; k < j; k++) {
                for(int l = 0; l < j; l++) {
                    encoded[k][l] = message.charAt(f);
                    f++;
                }
            }
            String secretMessage = "";
            for(int k = 0; k < j; k++) {
                for(int l = j-1; l >= 0; l--) {
                    if(encoded[l][k] != '*') secretMessage += encoded[l][k];
                }
            }
            System.out.println(secretMessage);
        }
    }
}
