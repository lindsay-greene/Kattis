import java.io.*; 
import java.util.*; 

public class soylent {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for(int i = 0; i < T; i++) {
			int N = input.nextInt();
			int bottles = 0;
			if(N % 400 == 0) bottles = N / 400;
			else bottles = (N / 400) + 1;
			System.out.println(bottles);
		}
	}
}