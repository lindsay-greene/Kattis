import java.io.*; 
import java.util.*; 

public class hissingmicrophone {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		String word = input.next();
		boolean works = false;
		for(int i = 0; i < word.length()-1; i++) {
			if(word.charAt(i) == 's' && word.charAt(i+1) == 's') {
				works = true;
			} 
		}
		if(works) {
			System.out.println("hiss");
		} else {
			System.out.println("no hiss");
		}
	}
}
