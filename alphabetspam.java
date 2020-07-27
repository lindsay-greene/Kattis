import java.io.*; 
import java.util.*; 

public class alphabetspam {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		String s = input.next();
		float whitespace = 0;
		float lower = 0;
		float upper = 0;
		float symbol = 0;
		for(int i= 0; i < s.length(); i++) {
			if(s.charAt(i) == '_') {
				whitespace += 1;
			} else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				lower += 1;
			} else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				upper += 1;
			} else {
				symbol += 1;
			}
		}
		System.out.println(whitespace / s.length());
		System.out.println(lower / s.length());
		System.out.println(upper / s.length());
		System.out.println(symbol / s.length());
	}
}