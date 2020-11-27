import java.io.*;
import java.util.*;

public class acm {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int score = 0;
        int numCorrect = 0;
        Map<String, Integer> attempts = new HashMap<String, Integer>();
        while(input.hasNext()) {
            StringTokenizer st = new StringTokenizer(input.nextLine(), " ");
            int min = Integer.parseInt(st.nextToken());
            if(min == -1) break;
            String problem = st.nextToken();
            String right = st.nextToken();
            if(right.equals("right")) {
                score += min;
                numCorrect++;
                if(attempts.containsKey(problem)) score += attempts.get(problem) * 20;
            } else {
                if(attempts.containsKey(problem)) attempts.put(problem, attempts.get(problem) + 1);
                else attempts.put(problem, 1);
            }
        }
        System.out.println(numCorrect + " " + score);
    }
}
