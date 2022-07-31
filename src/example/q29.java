package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q29 {
    private static int[] A;
    private static int[] num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = new int[n];
        for(int i=0 ; i<n ; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        num = new int[m];
        for(int i=0; i<m; i++) {
            findNum(Integer.parseInt(st.nextToken()), 0, n-1);
        }
    }

    private static void findNum(int num, int start, int end) {
        int midPoint = (start + end) / 2;

        if(A[midPoint] == num) {
            System.out.println(1);
        } else if (A[midPoint] < num) {
            if(midPoint == end) {
                System.out.println(0);
            } else {
                findNum(num, midPoint+1, end);
            }
        } else {
            findNum(num, start, midPoint-1);
        }
    }
}
