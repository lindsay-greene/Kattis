import java.io.*; 
import java.util.*; 

public class tri {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if(a + b == c) {
			System.out.println(a + "+" + b + "=" + c);
		} else if(a * b == c) {
			System.out.println(a + "*" + b + "=" + c);
		}else if(a - b == c) {
			System.out.println(a + "-" + b + "=" + c);
		}else if(a / b == c && a % b == 0) {
			System.out.println(a + "/" + b + "=" + c);
		}else if(a == b + c) {
			System.out.println(a + "=" + b + "+" + c);
		}else if(a == b * c) {
			System.out.println(a + "=" + b + "*" + c);
		}else if(a == b - c) {
			System.out.println(a + "=" + b + "-" + c);
		}else if(a == b / c && b % c == 0) {
			System.out.println(a + "=" + b + "/" + c);
		}
	}
}
