import java.io.*; 
import java.util.*; 

public class batterup {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double num = 0;
		double denom = n;
		for(int i = 0; i < n; i++) {
			double stat = input.nextDouble();
			if(stat >= 0) {
				num += stat;
			} else {
				denom -= 1;
			}
		}
		double ans = num / denom;
		System.out.println(ans);
	}
}
