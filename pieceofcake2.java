import java.io.*;
import java.util.*;

public class pieceofcake2 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double n = input.nextInt();
        double h = input.nextInt();
        double v = input.nextInt();
        int ans = 4;
        if(h < n/2) ans *= n - h;
        else ans *= h;
        if(v < n/2) ans *= n - v;
        else ans *= v;
        System.out.println(ans);
    }
}
