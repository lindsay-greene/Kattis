import java.io.*; 
import java.util.*; 

public class nastyhacks {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0; i < n; i++) {
			int r = input.nextInt();
			int e = input.nextInt();
			int c = input.nextInt();
			if(e - c > r) {
				System.out.println("advertise");
			} else if(e - c < r) {
				System.out.println("do not advertise");
			} else {
				System.out.println("does not matter");
			}
		}
	}
}
