import java.io.*;
import java.util.*;

public class r2 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int R1 = input.nextInt();
		int S = input.nextInt();
		int i = S - R1; 
		int R2 = S + i; 
		System.out.println(R2);
	}
}
