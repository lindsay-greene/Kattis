import java.io.*;
import java.util.*; 

public class detaileddifferences {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0; i < n; i++) {
			String one = input.next();
			String two = input.next();
			String compare = "";
			for(int j = 0; j < one.length(); j++) {
				for(int k = 0; k < one.length(); k++) {
					if(j == k && one.charAt(j) != two.charAt(k)) {
						compare += "*";
					} else if(j == k && one.charAt(j) == two.charAt(k)) {
						compare += ".";
					}
				}
			}
			System.out.println(one);
			System.out.println(two);
			System.out.println(compare);
			System.out.println();
		}
	}
}