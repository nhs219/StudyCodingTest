package book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BubbleSort {

    private static int[] array;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        array = new int[n];
        for(int i=0; i<n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        sort(n-1);

    }

    private static void sort(int end) {
       
        for(int i=0; i<end; i++) {
            if(array[i] > array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
        if(end == 0) {
            System.out.println("result :: " + Arrays.toString(array));
        } else {
            sort(end-1);
        }
    }
}
