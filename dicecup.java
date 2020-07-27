import java.io.*; 
import java.util.*; 

public class dicecup {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		int n = N + 1;
		int m = M + 1;
		if(n > m) {
			for(int i = m; i <= n; i++) {
				System.out.println(i);
			}
		} else if (m > n) {
			for(int f = n; f <= m; f++) {
				System.out.println(f);
			}
		} else if(n == m) {
			System.out.println(n);
		}
	}
}
