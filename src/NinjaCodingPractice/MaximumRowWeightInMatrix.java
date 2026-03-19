package NinjaCodingPractice;
import java.util.*;
public class MaximumRowWeightInMatrix {
// Ninja has been provided a matrix 'MAT' of size 'N X M' where 'M' is the number of columns in the matrix, and 'N' is the number of rows.
// The weight of the particular row is the sum of all elements in it. Ninja wants to find the maximum weight amongst all the rows.
// Your task is to help the ninja find the maximum weight amongst all the rows.
// EXAMPLE: Input: 'N' = 2, 'M' = 3, 'MAT' = [[1, 2, 3], [2, 0, 0]] Output: 6

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] MAT = new int[N][M];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    MAT[i][j] = sc.nextInt();
                }
            }

            System.out.println(maximumWeightRow(N, M, MAT));
        }
        sc.close();
    }

    
    public static int maximumWeightRow(int n, int m, int[][] mat) {
        // Stream each row, sum its elements, then find the maximum
        return Arrays.stream(mat)
                     .mapToInt(row -> Arrays.stream(row).sum())
                     .max()
                     .orElse(0); 
    }

}