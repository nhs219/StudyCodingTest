package book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class InsertSort {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[n];
        for(int i=0; i<n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        int idx = 1;
        while(idx <= n-1) {
            int temp = array[idx];
            int insertIdx = idx;
            for(int i = idx-1; i>=0; i--) {
                if(array[i] > temp) {
                    array[i+1] = array[i];
                    insertIdx = i;
                } 
                
                if(i==0) {
                    array[insertIdx] = temp;
                }
            }
            idx++;
        }

        System.out.println(Arrays.toString(array));

    }
}
