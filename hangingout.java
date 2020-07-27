import java.io.*; 
import java.util.*; 

public class hangingout {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int limit = input.nextInt();
		int events = input.nextInt();
		int current = 0;
		int denied = 0;
		for(int i = 0; i < events; i++) {
			String s = input.next();
			int group = input.nextInt();
			String e = new String("enter");
			String l = new String("leave");
			if(s.equals(e) && current + group <= limit) current += group;
			else if(s.equals(e) && current + group > limit) denied += 1;
			else current -= group;
		}
		System.out.println(denied);
	}
}
