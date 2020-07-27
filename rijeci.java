import java.io.*; 
import java.util.*; 

public class rijeci {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		int sumA = 0; 
		int sumB = 1;
		int a1 = 1;
		int a2 = 0; 
		int b1 = 0; 
		int b2 = 1;
		if(k == 1) sumA = 0;
		else {
			for(int i = 1; i < k; i++) {
				 sumA = a1 + a2;
				 sumB = b1 + b2; 
				 a1 = a2; 
				 a2 = sumA;
				 b1 = b2; 
				 b2 = sumB;
			}
		}
		System.out.println(sumA + " " + sumB);
	}
}
