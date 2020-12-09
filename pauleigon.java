import java.io.*;
import java.util.*;

public class pauleigon {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int turns = input.nextInt();
        int paul = input.nextInt();
        int opp = input.nextInt();
        int rounds = paul + opp;
        if(rounds/turns % 2 == 0) System.out.println("paul");
        else System.out.println("opponent");
    }
}
