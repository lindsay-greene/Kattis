import java.io.*; 
import java.util.*; 

public class zamka {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int L = input.nextInt();
		int D = input.nextInt();
		int X = input.nextInt();
		int N = 0; 
		int M = 0;
		for(int i = L; i <= D; i++) {
			int sum = 0; 
			int current = i;
			while(current > 0) {
				int digit = current % 10; 
				sum += digit; 
				current /= 10;
			}
			if(sum == X) {
				if(N == 0) N = i;
				M = i;
			}
		}
		System.out.println(N);
		System.out.println(M);
	}
}
