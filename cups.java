import java.io.*; 
import java.util.*;

public class cups {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		for(int i = 0; i < n; i++) {
			String s = input.next();
			String t = input.next();
			int diam; 
			String color;
			if(s.charAt(0) >= '0' && s.charAt(0) <= '9') {
				diam = Integer.parseInt(s);
				color = t;
			} else {
				diam = Integer.parseInt(t) * 2;
				color = s;
			}
			map.put(diam, color);
		}
		for(int key: map.keySet()) System.out.println(map.get(key));
	}
}