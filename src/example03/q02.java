package example03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class q02 {
    /**
     * N을 입력받음
     * N개수 만큼 int[]에 점수를 입력 받는다.
     * int[]에서 제일 큰 수를 M에 저장한다.
     *
     * -------------------------------------
     * 내가 짠 코드
     * for {
     *     int[i] = int[i] / M * 100 으로 저장
     * }
     * int[i]의 평균을 출력한다.
     * --------------------------------------
     * 책
     * for {
     *     최대값 M에 저장
     *     총점 구하기
     * }
     * 점수의 전체 합 * 100 / M / N 출력
     */

    public static void main(String[] args) throws IOException {
        // Scanner in = new Scanner(System.in);
        // int N = in.nextInt();
        // int[] score = new int[N];
        // int M = 0;
        // int sum = 0;
        // for (int i=0; i<N; i++) {
        //     score[i] = in.nextInt();
        // }

        // for(int s : score) {
        //     if(s>M) {
        //         M = s;
        //     }
        //     sum += s;
        // }
        // System.out.println((double) sum*100/M/N);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A[] = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int M = 0;
        int sum = 0;
        for(int i : A) {
            if (i > M) {
                M = i;
            }
            sum += i;
        }

        System.out.println((float)sum*100/M/N);
    }
}
