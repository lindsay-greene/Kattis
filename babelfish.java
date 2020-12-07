import java.io.*; 
import java.util.*; 

public class babelfish {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		HashMap<String, String> dict = new HashMap<String, String>();
		String words = input.nextLine();
		while(words.contains(" ")) {
			String english = words.split(" ")[0];
			String foreign = words.split(" ")[1];
			dict.put(foreign, english);
			words = input.nextLine();
		}
		while(input.hasNextLine()) {
			String word = input.nextLine();
			if(dict.containsKey(word)) System.out.println(dict.get(word));
			else System.out.println("eh");
		}
		input.close();
	}
}