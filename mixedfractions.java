import java.io.*; 
import java.util.*; 

public class mixedfractions {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			long whole = 0;
			long numProper = 0;
			long denomProper = 0;
			long num = input.nextLong();
			long denom = input.nextLong();
			if(num == 0 && denom == 0) {
				break;
			} else {
				denomProper = denom;
				whole = num / denom;
				numProper = num - (whole * denom);
				System.out.println(whole + " " + numProper + " " + "/" + " " + denomProper);
			}
		}
	}
}
