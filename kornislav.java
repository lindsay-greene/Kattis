import java.io.*;
import java.util.*;

public class kornislav {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[4];
        for(int i = 0; i < 4; i++) nums[i] = input.nextInt();
        Arrays.sort(nums);
        System.out.println(nums[0] * nums[2]);
    }
}
