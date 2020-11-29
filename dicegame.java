import java.io.*;
import java.util.*;

public class dicegame {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int[] g = new int[4];
        int[] e = new int[4];
        for(int i = 0; i < 4; i++) g[i] = input.nextInt();
        for(int i = 0; i < 4; i++) e[i] = input.nextInt();
        int gprob = 0;
        int eprob = 0;
        for(int i = 0; i < 4; i++) {
            if(g[i] > e[i]) gprob += (g[i] - e[i]);
            else if(e[i] > g[i]) eprob += (e[i] - g[i]);
        }
        if(gprob > eprob) System.out.println("Gunnar");
        else if(eprob > gprob) System.out.println("Emma");
        else System.out.println("Tie");
    }
}
