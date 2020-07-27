import java.io.*;
import java.util.*; 

public class pet {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int bestSum = 0;
		int bestIndex = 0;
		for(int i = 0; i < 5; i++) {
			int rowSum = 0;
			for(int f = 0; f < 4; f++) {
				int g = input.nextInt();
				rowSum += g;
			}
			if(rowSum > bestSum) {
				bestSum = rowSum;
				bestIndex = i + 1;
			}
		}
		System.out.print(bestIndex + " " + bestSum);
	}
}
