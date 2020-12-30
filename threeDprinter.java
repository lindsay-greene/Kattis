import java.io.*;
import java.util.*;

public class threeDprinter {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int days = 0;
        while(Math.pow(2, days) < n) days++;
        days++;
        System.out.println(days);
    }
}
