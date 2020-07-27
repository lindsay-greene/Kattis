import java.io.*; 
import java.util.*; 

public class judgingmoose {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();
		int r = input.nextInt();
		int points = 0;
		if(l == r && l != 0) {
			points = l + r;
			System.out.println("Even " + points);
		} else if(l > r) {
			points = l * 2;
			System.out.println("Odd " + points);
		} else if(r > l) {
			points = r * 2;
			System.out.println("Odd " + points);
		} else {
			System.out.println("Not a moose");
		}
	}
}
