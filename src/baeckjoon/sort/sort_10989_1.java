package baeckjoon.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class sort_10989_1 {

    // 숫자 크키가 10001까지여서, 계수 정렬이 제일 빠르다.

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];
        for(int i = 0 ; i < n ; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        for(int i = 0 ; i < 10001 ; i++) {
            if( i != 0) {
                bw.write((i + "\n").repeat(arr[i]));
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
