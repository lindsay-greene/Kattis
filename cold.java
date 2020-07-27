import java.io.*;
import java.util.*;

public class cold {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count = 0;
		for(int i = 0; i < n; i++) {
			int t = input.nextInt();
			if(t < 0) {
				count += 1;
			}
		}
		System.out.println(count);
	}
}
