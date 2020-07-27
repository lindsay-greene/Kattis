import java.io.*; 
import java.util.*; 

public class reversebinary {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String bin = Integer.toString(n, 2);
		String reversed = "";
		for(int i = bin.length() - 1; i >= 0; i--) {
			reversed += bin.charAt(i);
		}
		int ans = Integer.parseInt(reversed, 2);
		System.out.println(ans);
	}
}
