import java.io.*; 
import java.util.*; 

public class isithalloween {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String month = input.next();
		int day = input.nextInt();
		if(month.equals("OCT") && day == 31) {
			System.out.println("yup");
		} else if(month.contentEquals("DEC") && day == 25) {
			System.out.println("yup");
		} else {
			System.out.println("nope");
		}
	}
}
