import java.io.*; 
import java.util.*; 

public class ladder {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int h = input.nextInt();
		int v = input.nextInt();
		double radians = Math.toRadians(v);
		double sinValue = Math.sin(radians);
		int ladder = (int)Math.ceil(h/sinValue);
		System.out.print(ladder);
	}
}
