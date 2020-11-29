import java.io.*; 
import java.util.*;

public class lineup {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String[] list = new String[N];
		for(int i = 0; i < N; i++) {
			list[i] = input.next();
		}
		String[] ascending = new String[N];
		String[] descending = new String[N];
		for(int i = 0; i < N; i++) {
			ascending[i] = list[i];
			descending[i] = list[i];
		}
		Arrays.sort(ascending);
		Arrays.sort(descending, Collections.reverseOrder());
		if(Arrays.equals(ascending, list)) System.out.println("INCREASING");
		else if(Arrays.equals(descending, list)) System.out.println("DECREASING");
		else System.out.println("NEITHER");
	}
}
