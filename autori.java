import java.io.*; 
import java.util.*; 

public class autori {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		String name = input.next();
		String ans = "";
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				ans += ch;
			}
		}
		System.out.println(ans);
	}
}
