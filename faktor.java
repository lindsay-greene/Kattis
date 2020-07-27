import java.io.*; 
import java.util.*; 

public class faktor {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int I = input.nextInt();
		int ans = 1 + (A * (I-1));
		System.out.println(ans);
	}
}
