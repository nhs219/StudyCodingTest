package baeckjoon.first;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class f_10869 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
            
        System.out.println(n+m);
        System.out.println(n-m);
        System.out.println(n*m);
        System.out.println(n/m);
        System.out.println(n%m);

    }
}
