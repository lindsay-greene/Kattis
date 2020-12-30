import java.io.*;
import java.util.*;

public class sortofsorting {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(input.readLine());
        while(true) {
            String[] names = new String[num];
            for(int i = 0; i < num; i++) names[i] = input.readLine();
            Arrays.sort(names, Comparator.comparing(s -> s.substring(0, 2)));
            for(int i = 0; i < num; i++) System.out.println(names[i]);
            num = Integer.parseInt(input.readLine());
            if(num == 0) break;
            System.out.println();
        }
        input.close();
    }
}
