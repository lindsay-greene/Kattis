import java.io.*; 
import java.util.*; 

public class server {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int T = input.nextInt();
		int time = 0;
		int count = 0;
		for(int i = 0; i < n; i++) {
			int task = input.nextInt();
			if(time + task <= T) {
				time += task;
				count += 1;
			} else break;
		}
		System.out.println(count);
	}
}
