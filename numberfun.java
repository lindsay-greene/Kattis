import java.io.*; 
import java.util.*; 

public class numberfun {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i = 0; i < N; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			if(a + b == c || a - b == c || a * b == c || (a / b == c && a % b == 0)) {
				System.out.println("Possible");
			} else if(a == b + c || a == b -c || a == b * c || (a == b / c && b % c == 0)) {
				System.out.println("Possible");
			} else System.out.println("Impossible");
		}
	}
}