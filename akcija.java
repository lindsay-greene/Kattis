import java.io.*; 
import java.util.*; 

public class akcija {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int total = 0;
		int[] ar = new int[n];
		for(int i = 0; i < n; i++) {
			ar[i] = input.nextInt();
		}
		if(n % 3 == 0) {
			for(int i = 0; i < n; i += 3) {
				int min = Math.min(ar[i], Math.min(ar[i + 1], ar[i + 2]));
				
			}
		}
	}
}
