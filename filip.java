import java.io.*; 
import java.util.*; 

public class filip {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int reversedA = 100 * (A % 10);
		A /= 10;
		reversedA += 10 * (A % 10);
		A /= 10;
		reversedA += A % 10;
		int reversedB = 100 * (B % 10);
		B /= 10;
		reversedB += 10 * (B % 10);
		B /= 10;
		reversedB += B % 10;
		if(reversedA > reversedB) {
			System.out.print(reversedA);
		} else {
			System.out.print(reversedB);
		}
	}
}
