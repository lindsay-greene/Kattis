import java.io.*;
import java.util.*;

public class game2048 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int[][] board = new int[4][4];
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) board[i][j] = input.nextInt();
        }
        System.out.println(Arrays.deepToString(board));
        int move = input.nextInt();
        // Left
        if(move == 0) {
            System.out.println("yes");
            for(int i = 0; i < 4; i++) {
                System.out.println("round " + i);
                for(int j = 3; j > 0; j--) {
                    while(board[i][j-1] == 0) {
                        board[i][j-1] = board[i][j];
                        board[i][j] = 0;
                        System.out.println("while");
                        j--;
                    }
                    System.out.println(j);
                    System.out.println(Arrays.deepToString(board));
                    if(j < 3 && board[i][j] == board[i][j+1]) {
                        board[i][j] *= 2;
                        board[i][j+1] = 0;
                        System.out.println("if");
                    }
                    System.out.println(Arrays.deepToString(board));
                }
                for(int j = 0; j < 3; j++) {
                    if(j < 3 && board[i][j] == board[i][j+1]) {
                        board[i][j] *= 2;
                        board[i][j+1] = 0;
                        System.out.println("if");
                    }
                    System.out.println(Arrays.deepToString(board));
                }
                for(int j = 3; j > 0; j--) {
//                    if(board[i][j] == 0 && board[i][j+1] != 0) {
//                        System.out.println(board[i][j] + " " + board[i][j+1]);
//                        System.out.println("if2");
//                        board[i][j] = board[i][j+1];
//                        board[i][j+1] = 0;
//                    }
                    while(board[i][j-1] == 0) {
                        board[i][j-1] = board[i][j];
                        board[i][j] = 0;
                        System.out.println("while");
                        j--;
                    }
                    System.out.println(Arrays.deepToString(board));
                }
            }
        } // Up
        else if(move == 1) {

        } // Right
        else if(move == 2) {

        } // Down
        else {
            
        }
        System.out.println(Arrays.deepToString(board));
    }
}
