package baeckjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort_2750 {

    private static int[] array;
    public static void main(String[] args) throws IOException{
        //N개의 수가 주어졌을 때 오름차순으로 정렬

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        array = new int[n];
        for(int i = 0 ; i < n ; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        sort(n);

        for(int i : array) {
            System.out.println(i);
        }

        br.close();
    }

    private static void sort(int end) {
        if(end == 0) {
            return;
        }

        for(int i = 0; i < end-1; i++) {
            if(array[i] > array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        sort(end-1);
    }
}
