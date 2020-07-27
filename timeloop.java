import java.io.*;
import java.util.*;

public class timeloop 
{
	public static void main(String[] args)throws IOException
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println(i + " Abracadabra");
		}
	}
}