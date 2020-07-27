import java.io.*; 
import java.util.*; 

public class fizzbuzz {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int Y = input.nextInt();
		int N = input.nextInt();
		for(int i = 1; i <= N; i++) {
			if(i % X == 0 && i % Y == 0) {
				System.out.println("fizzbuzz");
			} else if(i % X == 0) {
				System.out.println("fizz");
			} else if(i % Y == 0 && i % Y == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
