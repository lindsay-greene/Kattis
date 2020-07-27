import java.io.*; 
import java.util.*; 

public class pot {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int sum = 0;
		for(int i = 0; i < N; i++) {
			String P = input.next();
			String base = P.substring(0,P.length()-1);
			String power = P.substring(P.length()-1,P.length());
			int b = Integer.parseInt(base);
			int p = Integer.parseInt(power);
			int ans = (int)Math.pow(b, p);
			sum += ans;
		}
		
		System.out.println(sum);
	}
}
