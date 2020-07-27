import java.io.*; 
import java.util.*; 

public class everywhere {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for(int i = 0; i < T; i++) {
			int n = input.nextInt();
			HashSet<String> cities = new HashSet();
			for(int f = 0; f < n; f++) {
				String city = input.next();
				cities.add(city);
			}
			System.out.println(cities.size());
		} 
	}
}
