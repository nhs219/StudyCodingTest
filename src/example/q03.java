package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class q03 {

    /**
     * 숫자 N과 M을 입력 받는다.
     * for {
     *     num[]에 N 만큼 숫자 입력받기
     *     sum[]에 합배열 저장하기
     * }
     * for {
     *     M의 수 만큼
     *     start/end 숫자 입력받기
     *     result[]에 sum[end]-sum[start-1] 저장
     * }
     *
     * for {
     *     result 출력
     * }
     */

     /*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] num = new int[n];
        int[] sum = new int[n];
        for(int i=0; i<n ;i++) {
            num[i] = in.nextInt();
            if(i==0) {
                sum[i] = num[i];
            } else {
                sum[i] = sum[i-1] + num[i];
            }
        }
        int[] results = new int[m];
        for(int j=0; j<m; j++) {
            int start = in.nextInt() -1;
            int end = in.nextInt() -1;
            if (start-1 < 0) {
                results[j] = sum[end];
            } else {
                results[j] = sum[end] - sum[start-1];
            }
        }

        for(int result : results) {
            System.out.println(result);
        }
    } */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] sumArr = new int[n+1];
        int[] result = new int[m];

        for(int i=1; i<n+1; i++) {
            sumArr[i] = sumArr[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int k=0; k<m; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            result[k] = (sumArr[j] - sumArr[i-1]);
        }

        for (int i : result) {
            System.out.println(i);
        }
    }
}