import java.io.*;
import java.util.*;

public class speedlimit {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		while(input.hasNextInt()) {
			int n = input.nextInt();
			if(n == -1) {
				break;
			} 
			int before = 0;
			int total = 0;
			for(int i = 0; i < n; i++) {
				int s = input.nextInt();
				int t = input.nextInt();
				int diff = t - before;
				int subtotal = diff * s;
				total += subtotal;
				before = t;
			}
			System.out.println(total + " miles");
		}
	}
}
