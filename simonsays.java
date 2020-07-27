import java.io.*; 
import java.util.*; 

public class simonsays {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.nextLine();
		for(int i = 0; i < N; i++) {
			String instruction = input.nextLine();
			if(instruction.length() >= 10 && instruction.substring(0, 10).equals("Simon says")){
				System.out.println(instruction.substring(11));
			}
		}
	}
}
