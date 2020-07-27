import java.io.*; 
import java.util.*; 

public class bijele {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		int[] ar = {1, 1, 2, 2, 2, 8};
		for(int i = 0; i < 6; i++) {
			int n = input.nextInt();
			System.out.print(ar[i]-n + " ");
		}
	}
}
