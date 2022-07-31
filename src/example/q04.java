package example;

import java.util.Scanner;

public class q04 {

    /**
     * N, M 입력 받기
     * for(N) {
     *     for(N) {
     *         NUM 배열 입력받기
     *         SUM 배열 만들기
     *     }
     * }
     * for(M) {
     *     xy값 입력받기
     * }
     *
     * for(M) {
     *     result 출력하기
     * }
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[][] num = new int[N][N];
        int[][] sum = new int[N][N];

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                num[i][j] = in.nextInt();

                if(i-1 >= 0 && j-1 >= 0) {
                    sum[i][j] = num[i][j] + sum[i-1][j]  + sum [i][j-1] - sum [i-1][j-1];
                } else if(i-1 >= 0 && j-1 < 0) {
                    sum[i][j] = num[i][j] + sum[i-1][j];
                } else if(i-1 < 0 && j-1 >=0) {
                    sum[i][j] = num[i][j] + sum[i][j-1];
                } else {
                    sum[i][j] = num[i][j];
                }
            }
        }

        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        for(int i=0; i<M; i++) {
            x1 = in.nextInt();
            y1 = in.nextInt();
            x2 = in.nextInt();
            y2 = in.nextInt();
        }

        for(int i=0; i<M ; i++) {
            int result = 0;
            if(x1-1>=0 && y1-1>=0) {
                result = sum[x2][y2] - sum[x1-1][y2] - sum[x2][y1-1] + sum[x1-1][y1-1];
            }else if (x1-1>=0 && y1-1<0) {
                result = sum[x2][y2] - sum[x1-1][y1];
            }else if (x1-1<0 && y1-1>=0) {
                result = sum[x2][y2] - sum[x1][y1-1];
            }else {
                result = sum[x1][y1];
            }
            System.out.println(result);
        }
    }
}
