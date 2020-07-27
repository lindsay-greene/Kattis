import java.io.*; 
import java.util.*; 

public class conundrum {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String text = input.next();
		String per = "";
		int days = 0;
		for(int i = 0; i < (text.length() / 3); i++) {
			per += "PER";
		}
		for(int j = 0; j < text.length(); j++) {
			for(int k = 0; k < text.length(); k++) {
				if(j == k && text.charAt(j) != per.charAt(k)) {
					days += 1;
				}
			}
		}
		System.out.println(days);
	}
}