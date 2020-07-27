import java.io.*;
import java.util.*;

public class heartrate {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i = 0; i < N; i++) {
			double b = input.nextDouble();
			double p = input.nextDouble();
			double bpm = (60 * b) / p;
			double min = (60 * (b - 1)) / p;
			double max = (60 * (b + 1)) / p;
			System.out.println(min + " " + bpm + " " + max);
		}
	}
}
