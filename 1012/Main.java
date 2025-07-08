import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matB = new int[row][col];
        int B = sc.nextInt();
        int res = 0;
        
        for (int i = 0; i < B; ++i) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            matB[x][y] = 1;
        }
        
        for (int i = 0; i < B; ++i) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (x-1 > 0 && y-1 > 0 && x+1 < B && y+1 < B) {
                mat[x]
            }
        }
        
        sc.close();
    }
}
