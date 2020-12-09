import java.io.*;
import java.util.*;

public class busnumbers {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] buses = new int[n];
        for(int i = 0; i < n; i++) buses[i] = input.nextInt();
        Arrays.sort(buses);
        for(int i = 0; i < buses.length-1; i++) {
            int first = buses[i];
            int last;
            while(buses[i] + 1 == buses[i+1]) {

            }
        }
    }
}
