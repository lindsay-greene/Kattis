import java.io.*; 
import java.util.*; 

public class quickestimate {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i = 0; i < N; i++) {
            String cost = input.next();
            int magnitude = cost.length();
            System.out.println(magnitude);
        }
    }
}
