import java.io.*; 
import java.util.*; 

public class cetvrta {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		int x3 = input.nextInt();
		int y3 = input.nextInt();
		int x4 = 0;
		int y4 = 0;
		if(x1 == x2) {
			x4 = x3;
		} else if(x1 == x3) {
			x4 = x2;
		} else {
			x4 = x1;
		}
		if(y1 == y2) {
			y4 = y3;
		} else if(y1 == y3) {
			y4 = y2;
		} else {
			y4 = y1;
		}
		System.out.print(x4 + " " + y4);
	}
}
