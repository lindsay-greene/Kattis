import java.io.*; 
import java.util.*; 

public class apaxiaaans {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String name = input.next();
		String newName = "";
		for(int i = 0; i < name.length() - 1; i++) {
			if(name.charAt(i) != name.charAt(i + 1)) {
				newName += name.charAt(i);
			}
		}
		newName += name.charAt(name.length() - 1);
		System.out.println(newName);
	}	
}

