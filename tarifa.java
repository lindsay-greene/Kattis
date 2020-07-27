import java.io.*;
import java.util.*;

public class tarifa {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int N = input.nextInt();
		int avail = (X * N) + X;
		int used = 0;
		for(int i = 0; i < N; i++) {
			int P = input.nextInt();
			used += P;
		}
		System.out.println(avail - used);
	}
} 
