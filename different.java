import java.io.*; 
import java.util.*; 

public class different {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		while(input.hasNextLong()) {
			long a = input.nextLong();
			long b = input.nextLong();
			long c = a - b;
			long difference = Math.abs(c);
			System.out.println(difference);
		}
	}
}
