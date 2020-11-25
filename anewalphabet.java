import java.io.*; 
import java.util.*; 

public class anewalphabet {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		text = text.toLowerCase();
		String[] newAlph1 = {"@", "8", "(", "|)", "3", "#", "6", "[-]", "|", "_|", "|<", "1", "[]\\/[]", "[]\\[]", "0", "|D", "(,)", "|Z", "$", "']['", "|_|", "\\/", "\\/\\/", "}{", "`/", "2"};
		String translated = "";
		for(int i = 0; i < text.length(); i++) {
			int ind = (int)(text.charAt(i));
			if(ind >= 97 && ind <= 122) {
				String newChar = newAlph1[ind - 'a'];
				translated += newChar;
			} else translated += text.charAt(i);
		}
		System.out.println(translated);
	}
}
