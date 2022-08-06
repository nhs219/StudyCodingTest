package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q42 {

    private static int num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] start = new int[n];
        int[] end = new int[n];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            start[i] = Integer.parseInt(st.nextToken());
            end[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<n; i++) {
            gcd(start[i], end[i]);

            System.out.println(start[i] * end[i] / num);
        }
    }

    private static void gcd(int start, int end) {
        int mod = end % start;
        if(mod == 0) {
            num = start;
        } else {
            gcd(mod, start);
        }
    }
}
