import java.io.*; 
import java.util.*; 

public class pizza2 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		double R = input.nextDouble();
		double C = input.nextDouble();
		double totalArea = (Math.PI) * (R * R);
		double cheeseArea = (Math.PI) * ((R - C) * (R - C));
		double percent = (cheeseArea / totalArea) * 100;
		System.out.println(percent);
	}
}
