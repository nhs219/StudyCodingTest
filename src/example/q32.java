package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q32 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] A = new int[n];
        for(int i=0; i<n ; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for(int i=n-1; i>=0; i--) {
            int money = A[i];

            if(money<k) {
                count = count + k/money;
                k = k%money;
            }

            if(k==0) {
                break;
            }
        }

        System.out.println(count);
    }
}
