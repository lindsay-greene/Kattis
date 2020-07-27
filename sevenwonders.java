import java.io.*; 
import java.util.*; 

public class sevenwonders {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String cards = input.next();
		int ans = 0;
		int t = 0;
		int g = 0;
		int c = 0;
		for(int i = 0; i < cards.length(); i++) {
			if(cards.charAt(i) == 'T') t++;
			else if(cards.charAt(i) == 'G') g++;
			else c ++;
		}
		int partial = t*t + g*g + c*c;
		int sevens = Math.min(t, Math.min(g, c));
		System.out.println(partial + sevens * 7);
	
	}
}
