import java.io.*; 
import java.util.*; 

public class abc {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int one = input.nextInt();
		int two = input.nextInt();
		int three = input.nextInt();
		input.nextLine();
		String order = input.next();
		int a = 0; 
		int b = 0; 
		int c = 0;
		if(one < two && one < three && two < three) {
			a = one;
			b = two; 
			c = three;
		} else if(one > two && one < three && three > two) {
			a = two;
			b = one;
			c = three;
		} else if(one > two && one > three && two < three) {
		    a = two; 
			b = three;
			c = one;
		} else if (one > three && one > two && two > three) {
			a = three; 
			b = two; 
			c = one;
		} else if(one < three && one < two && three < two) {
			a = one; 
			b = three;
			c = two;
		} else if(two > one && two > three && one > three) {
			a = three; 
			b = one; 
			c = two;
		}
		if(order.equals("ABC")) {
			System.out.println(a + " " + b + " " + c);
		} else if(order.equals("ACB")) {
			System.out.println(a + " " + c + " " + b);
		} else if(order.equals("BAC")){
			System.out.println(b + " " + a + " " + c);
		} else if(order.equals("BCA")) {
			System.out.println(b + " " + c + " " + a);
		} else if(order.equals("CAB")) {
			System.out.println(c + " " + a + " " + b);
		} else if(order.equals("CBA")){
			System.out.println(c + " " + b + " " + a);
		}
	}
}
