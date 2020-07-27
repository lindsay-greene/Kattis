import java.io.*; 
import java.util.*; 

public class bookingaroom {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		int n = input.nextInt();
		if(r == n) System.out.print("too late");
		else{
			int[] num = new int[n];
			for(int i = 0; i < n; i++) num[i] = input.nextInt();
			boolean notIn = true;
			int j = 1;
			for(int i = 0; i < n; i++) {
				while(j < n && notIn == true) {
					if(j != num[i]) notIn = false;
					else notIn = true;
					j += 1;
				}
			}
			System.out.print(j); 
		}
	}
}
