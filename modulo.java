import java.io.*; 
import java.util.*; 

public class modulo {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		HashSet<Integer> ans = new HashSet();
		for(int i = 0; i < 10; i++) {
			int A = input.nextInt();
			int B = 42;
			ans.add(A % 42);
		}
		System.out.print(ans.size());
	}
}
