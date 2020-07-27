import java.io.*; 
import java.util.*;

public class aaah {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String jon = input.next();
		String doc = input.next();
		if(jon.length() >= doc.length()) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}
	}
}
