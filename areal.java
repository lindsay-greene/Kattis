import java.io.*; 
import java.util.*; 

public class areal {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		double area = input.nextDouble();
		double side = Math.sqrt(area);
		double length = side * 4;
		System.out.println(length);
	}
}
