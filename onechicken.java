import java.io.*; 
import java.util.*; 

public class onechicken {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		if(N < M) {
			int P = M - N;
			if(P != 1) System.out.print("Dr. Chaz will have " + P + " pieces of chicken left over!");
			else System.out.print("Dr. Chaz will have 1 piece of chicken left over!");
		} else {
			int Q = N - M;
			if(Q != 1) System.out.print("Dr. Chaz needs " + Q + " more pieces of chicken!");
			else System.out.print("Dr. Chaz needs 1 more piece of chicken!");
		}
	}
}
