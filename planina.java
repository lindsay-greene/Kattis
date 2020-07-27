import java.io.*; 
import java.util.*; 

public class planina {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int top = 2;
		int ans = 0;
		for(int i = 1; i <= N; i++) {
			top += (top -1);
		}
		ans = top*top;
		System.out.print(ans);
	}
}
