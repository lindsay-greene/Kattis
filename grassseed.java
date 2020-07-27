import java.io.*; 
import java.util.*; 

public class grassseed {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		double C = input.nextDouble();
		int L = input.nextInt();
		double lawns = 0;
		double ans = 0;
		for(int i = 0; i < L; i++) {
			double w = input.nextDouble();
			double l = input.nextDouble();
			lawns += w * l;
			ans = C * lawns;
		}
		System.out.print(ans);
	}
}
