import java.io.*;
import java.util.*;

public class cd {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = input.readLine();
        String[] parts = line.split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        HashSet<String> set = new HashSet<String>(1000000, 1.0f);
        while(n > 0 || m > 0) {
            for(int i = 0; i < n; i++) {
                String cd = input.readLine();
                set.add(cd);
            }
            int count = 0;
            for(int i = 0; i < m; i++) {
                String cd = input.readLine();
                if(set.contains(cd)) count++;
            }
            System.out.println(count);
            line = input.readLine();
            parts = line.split(" ");
            n = Integer.parseInt(parts[0]);
            m = Integer.parseInt(parts[1]);
            set.clear();
        }
    }
}