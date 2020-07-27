import java.io.*;
import java.util.*; 

public class sibice {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int W = input.nextInt();
		int H = input.nextInt();
		int diag = (int)Math.sqrt((H*H) + (W*W));
		while(input.hasNext()) {
			int match = input.nextInt();
			if(match <= diag) {
				System.out.println("DA");
			} else System.out.println("NE");
		}
	}
}
