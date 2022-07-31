package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10 {
    static int[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        A = new int[N];
        int result = 0;

        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        for(int end = 0; end<N; end++) {
            int start = end-L+1<0?0:end-L+1;
            result = getMin(start, end);
            System.out.print(result+ " ");
        }
    }

    private static int getMin(int start, int end) {
        int min = A[start];
        for(int i=start+1; i<=end; i++) {
            if(A[i]<min) {
                min = A[i];
            }
        }
        return min;
    }
}
