import java.io.*; 
import java.util.*;

public class quadrant {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		if(x > 0 && y > 0) {
			System.out.println(1);
		} else if(x < 0 && y > 0) {
			System.out.println(2);
		} else if(x < 0 && y < 0) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}
}
