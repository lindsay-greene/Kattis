import java.io.*; 
import java.util.*; 

public class lastfactorialdigit {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for(int i = 0; i < T; i++) {
			int N = input.nextInt();
			int product = 1;
			for(int j = 1; j <= N; j++) {
				product *= j;
			}
			int lastDigit = product % 10;
			System.out.println(lastDigit);
		}
	}
}
