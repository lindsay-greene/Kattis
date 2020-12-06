import java.io.*;
import java.util.*;

public class plantingtrees {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] seedlings = new int[n];
        for(int i = 0; i < n; i++) seedlings[i] = input.nextInt();
        Arrays.sort(seedlings);
        int days = seedlings[n-1] + 2;
        int count = 2;
        for(int i = n-2; i >= 0; i--) {
            if(seedlings[i] + 1 + count > days) {
                days += (seedlings[i] + 1 + count) - days;
            }
            count++;
        }
        System.out.println(days);
    }
}
