import java.io.*; 
import java.util.*; 

public class anewalphabet {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String text = input.next();
		String translated = "";
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == 'a' || text.charAt(i) == 'A') {
				translated += '@';
			} else if(text.charAt(i) == 'b' || text.charAt(i) == 'B') {
				translated += '8';
			} else if(text.charAt(i) == 'c' || text.charAt(i) == 'C') {
				translated += '(';
			} else if(text.charAt(i) == 'd' || text.charAt(i) == 'D') {
				translated += ')';
			} else if(text.charAt(i) == 'e' || text.charAt(i) == 'E') {
				translated += '3';
			} 
		}
		System.out.println(translated);
	}
}
