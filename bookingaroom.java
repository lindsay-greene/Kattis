import java.io.*; 
import java.util.*; 

public class bookingaroom {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		int n = input.nextInt();
		if(r == n) System.out.print("too late");
		else{
			ArrayList<Integer> rooms = new ArrayList<Integer>();
			for(int i = 0; i < r; i++) rooms.add(i + 1);
			for(int i = 0; i < n; i++) {
				int rm = input.nextInt();
				rooms.remove(new Integer (rm));
			}
			System.out.println(rooms.get(0));
		}
	}
}
