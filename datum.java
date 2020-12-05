import java.io.*;
import java.util.*;

public class datum {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        int m = input.nextInt();
        int days = d;
        if(m == 1);
        else if(m == 2) days += 31;
        else if (m == 3) days += 59;
        else if(m >= 4 && m <= 8){
            int has = 30 * (m-1);
            int extra;
            if(m % 2 == 0) extra = ((m-2)/2) + 1;
            else extra = m/2;
            extra -= 2;
            days += has + extra;
        } else {
            int has = 30 * (m-1);
            int extra;
            if(m == 9 || m == 10) extra = 3;
            else extra = 4;
            days += has + extra;
        }
        if(days % 7 == 0) System.out.println("Wednesday");
        else if(days % 7 == 1) System.out.println("Thursday");
        else if(days % 7 == 2) System.out.println("Friday");
        else if(days % 7 == 3) System.out.println("Saturday");
        else if(days % 7 == 4) System.out.println("Sunday");
        else if(days % 7 == 5) System.out.println("Monday");
        else System.out.println("Tuesday");
    }
}
