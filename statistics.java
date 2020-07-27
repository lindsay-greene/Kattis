import java.io.*; 
import java.util.*; 

public class statistics {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int i = 1;
		while(input.hasNextLine()) {
			String line = input.nextLine();
			String[] ar = line.split(" ");
			int min = 0;
			int max = 0;
			int n = Integer.parseInt(ar[0]);
			for(int k = 0; k < n; k++) {
				int value = Integer.parseInt(ar[k + 1]);
				if(k == 0) {
					min = value;
					max = value;
				}
				if(value < min) min = value;
				if(value > max) max = value;
			}
			System.out.println("Case " + i + ": " + min + " " + max + " " + (max - min));
			i += 1;
		}
	}
}
