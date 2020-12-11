import java.io.*;
import java.util.*;

public class busnumbers {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] buses = new int[n];
        for(int i = 0; i < n; i++) buses[i] = input.nextInt();
        Arrays.sort(buses);
        String ans = "" + buses[0];
        for(int i = 1; i < n; i++) {
            if(buses[i] == buses[i-1]+1) {
                if(n > i+1 && buses[i+1] == buses[i]+1) {
                    ans += "-";
                    i += 2;
                    while(n > i && buses[i] == buses[i-1]+1) i++;
                    i--;
                    ans += buses[i];
                } else ans += " " + buses[i];
            } else ans += " " + buses[i];
        }
        System.out.println(ans);
    }
}
