import java.io.*; 
import java.util.*; 

public class spavanac {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int H = input.nextInt(); 
		int M = input.nextInt();
		if(H == 0) {
			H = 24;
			int timeInMinutes = (60 * H) + M;
			int newTimeInMinutes = timeInMinutes - 45;
			int finalHours = (int)Math.floor(newTimeInMinutes / 60);
			int finalMinutes = newTimeInMinutes % 60;
			System.out.println(finalHours + " " + finalMinutes);
		} else {
			int timeInMinutes = (60 * H) + M;
			int newTimeInMinutes = timeInMinutes - 45;
			int finalHours = (int)Math.floor(newTimeInMinutes / 60);
			int finalMinutes = newTimeInMinutes % 60;
			System.out.println(finalHours + " " + finalMinutes);
		}
	}
}
