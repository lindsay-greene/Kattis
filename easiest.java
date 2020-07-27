import java.io.*; 
import java.util.*; 

public class easiest {
	public static int sum(int N) {
		int sum = 0;
		while(N > 0) {
			int digit = N % 10;
			sum += digit;
			N /= 10;
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine()) {
			String N = input.nextLine();
			int number = Integer.parseInt(N);
			if(number == 0) break;
			int p = 11;
			while(sum(p * number) != sum(number)) p++;
			System.out.println(p);
		}
	}
}
