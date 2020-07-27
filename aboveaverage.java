import java.io.*;
import java.util.*; 

public class aboveaverage {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int C = input.nextInt();
		for(int i = 0; i < C; i++) {
			double addGrades = 0;
			double above = 0;
			int N = input.nextInt();
			int[] ar = new int[N];
			for(int j = 0; j < N; j++) {
				ar[j] = input.nextInt();
				addGrades += ar[j];
			}
			double average = addGrades / N;
			for(int j = 0; j < ar.length; j++) {
				if(ar[j] > average) {
					above += 1;
				}
			}
			double percent = (above / N) * 100;
			System.out.printf("%.3f%%%n", percent);
		}
	}
}
