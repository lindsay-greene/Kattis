import java.io.*; 
import java.util.*;

public class nodup {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String phrase = input.nextLine();
		String[] words = phrase.split(" ");
		HashSet<String> nodup = new HashSet<String>();
		for(int i = 0; i < words.length; i++) nodup.add(words[i]);
		if(nodup.size() < words.length) System.out.println("no");
		else System.out.println("yes");
	}
}
