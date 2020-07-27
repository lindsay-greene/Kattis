import java.io.*; 
import java.util.*; 

public class babelfish {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		HashMap<String, String> dict = new HashMap<String, String>();
		while(input.hasNextLine()) {
			String words = input.nextLine();
			if(words.equals("")) break;
			String[] pairs = words.split(" ");
			String english = pairs[0];
			String foreign = pairs[1];
			dict.put(foreign, english);
		}
		while(input.hasNextLine()) {
			String word = input.next();
			if(dict.containsKey(word)) System.out.println(dict.get(word));
			else System.out.println("eh");
		}
		System.out.println(dict);
	}
}