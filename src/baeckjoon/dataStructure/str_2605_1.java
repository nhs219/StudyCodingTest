package baeckjoon.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class str_2605_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
    
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i < n+1 ; i++ ) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //linkedList or Vector 사용하기
        
    }
}
