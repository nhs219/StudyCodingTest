package baeckjoon.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class sort_10989 {
    private static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        quickSort(0, arr.length-1);

        for(int i : arr) {
            bw.write(i + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static void quickSort(int start, int end) {
        int part = partition(start, end);

        if (start < part-1) {
            quickSort(start, part-1);
        }

        if (end > part) {
            quickSort(part, end);
        }
    }

    private static int partition(int start, int end) {
        int pivot = arr[(start + end) / 2];

        while(start <= end) {
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;

            if(start <= end) {
                swap(start, end);
                start++;
                end--;
            }
        }

        return start; 
    }

    private static void swap(int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
