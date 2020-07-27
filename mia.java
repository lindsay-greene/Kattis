import java.io.*; 
import java.util.*;

public class mia {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine()) {
			String line = input.nextLine();
			String[] rolls = line.split(" ");
			int s0 = Integer.parseInt(rolls[0]);
			int s1 = Integer.parseInt(rolls[1]);
			int r0 = Integer.parseInt(rolls[2]);
			int r1 = Integer.parseInt(rolls[3]);
			int player = 0;
			int points = 0;
			if(s0 == 0) break;
			if((s0 == 1 && s0 == 2) || (s0 ==2 && s1 == 2)) player = 1;
			else if((r0 == 1 || r1 == 2) || (r0 == 2 && r1 == 1)) player = 2;
			else if(s0 == s1) {
			
			}
		}
	}
}
