import java.io.*;
import java.util.*;

public class symmetricorder {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int set = 1;
		while(true) {
			int n = input.nextInt();
			if(n == 0) break;
			ArrayList<String> evens = new ArrayList<String>();
			ArrayList<String> odds = new ArrayList<String>();
			for(int i = 0; i < n; i++) {
				String name = input.next();
				if(i % 2 == 0) evens.add(name);
				else odds.add(name);
			}
			System.out.println("Set " + set);
			for(int i = 0; i < evens.size(); i++) System.out.println(evens.get(i));
			for(int i = odds.size() - 1; i >= 0; i--) System.out.println(odds.get(i));
			set ++;
		}
	}
}
