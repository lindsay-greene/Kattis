import java.io.*; 
import java.util.*; 

public class qaly {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		double qaly = 0;
		for(int i = 0; i < N; i++) {
			double q = input.nextDouble();
			double y = input.nextDouble();
			qaly += q * y;
		}
		System.out.println(qaly);
	}
}
