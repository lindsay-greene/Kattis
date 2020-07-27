import java.io.*; 
import java.util.*;

public class sumkindofproblem {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int P = input.nextInt();
		for(int i = 0; i < P; i++) {
			int K = input.nextInt();
			int N = input.nextInt();
			int S1 = N * (N + 1) / 2;
			int S2 = N * N;
			int S3 = S1 * 2;
			System.out.println(K + " " + S1 + " " + S2 + " " + S3);
		}
	}
}
