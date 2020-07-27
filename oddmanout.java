import java.io.*; 
import java.util.*; 

public class oddmanout {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i = 0; i < N; i++) {
			int G = input.nextInt();
			int[] numbers = new int[G];
			for(int j = 0; j < G; j++) {
				int C = input.nextInt();
				numbers[j] = C;
			}
			for(int j = 0; j < G; j++) {
				boolean found = false;
				for(int k = 0; k < G; k++) {
					if(j != k && numbers[j] == numbers[k]) {
						found = true;
					} 
				}
				if(found == false) {
					System.out.println("Case #" + (i+1) + ": " + numbers[j]);
				}
			}
		}
	}
}
