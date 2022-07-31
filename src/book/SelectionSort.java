package book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SelectionSort {
    private static int n;
    private static int[] array;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        array = new int[n];
        for(int i=0; i<n ; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        while(start < n-1) {
            int min = start;
            for(int i = start + 1 ; i < n ; i++) {
                if(array[min] > array[i]) {
                    min = i;
                }
            }
            int temp = array[start];
            array[start] = array[min];
            array[min] = temp;
            start++;
        }
        
        System.out.println(Arrays.toString(array));
    }
}
