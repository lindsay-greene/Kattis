import java.io.*; 
import java.util.*; 

public class bela {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String B = input.next();
		char b = B.charAt(0);
		int sum = 0;
		for(int i = 0; i < (N * 4); i++) {
			String card = input.next();
			char number = card.charAt(0);
			char suit = card.charAt(1);
			if(number == 'A') {
				sum += 11;
			} else if(number == 'K') {
				sum += 4;
			} else if(number == 'Q') {
				sum += 3;
			} else if(number == 'T') {
				sum += 10;
			} else if(suit == b && number == 'J') {
					sum += 20;
			} else if(suit == b && number == '9') {
					sum += 14;
			} else if(suit != b && number == 'J') {
				sum += 2;
			} else {
				sum += 0;
			}
		}
		System.out.println(sum);
	}
}
