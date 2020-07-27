import java.io.*; 
import java.util.*; 

public class trik {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		boolean one = true;
		boolean two = false; 
		boolean three = false;
		String moves = input.next();
		for(int i = 0; i < moves.length(); i++) {
			if(moves.charAt(i) == 'A') {
				if(one) {
					two = true;
					one = false;
				} else if(two) {
					one = true;
					two = false;
				}
			} else if(moves.charAt(i) == 'B') {
				if(two) {
					three = true;
					two = false;
				} else if(three) {
					two = true;
					three = false;
				}
			} else if(moves.charAt(i) == 'C') {
				if(one) {
					three = true;
					one = false;
				} else if(three) {
					one = true;
					three = false;
				}
			}
		}
		if(one) {
			System.out.print(1);
		} else if(two) {
			System.out.print(2);
		} else {
			System.out.print(3);
		}
	}
}
