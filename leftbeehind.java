import java.io.*; 
import java.util.*; 

public class leftbeehind {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine()) {
			String line = input.nextLine();
			String[] ar = line.split(" ");
			int x = Integer.parseInt(ar[0]);
			int y = Integer.parseInt(ar[1]);
			if(x == 0 && y == 0) break; 
			else {
				if(x + y == 13) System.out.println("Never speak again.");
				else if(x > y) System.out.println("To the convention.");
				else if(x < y) System.out.println("Left beehind.");
				else if(x == y) System.out.println("Undecided.");
			}
		}
	}
}
