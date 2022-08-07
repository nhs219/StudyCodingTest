package baeckjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort_2750_1 {

    private static int[] array;

    public static void main(String[] args) throws IOException{
        // 정렬에선 대부분 퀵정렬이 제일 적합하다.
        // 일정한 범위가 정해진 수라면 계수 정렬이 제일 빠르다.
        // 퀵 정렬은 Pivot을 정하여 pivot보다 작으면 pivot 앞으로
        // pivot보다 크면 pivot 뒤로 이동

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        array = new int[n];
        for(int i = 0 ; i < n ; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        quickSort(0, n-1);

        for(int i : array) {
            System.out.println(i);
        }

        br.close();
    }

    private static void quickSort(int start, int end) {
        int part = partition(start, end);
        if(start < part-1) {
            quickSort(start, part-1);
        }

        if(end > part) {
            quickSort(part, end);
        }
    }

    private static int partition(int start, int end) {
        int pivot = array[(start + end) /2];
        while(start <= end) {
            while(array[start] < pivot) start++;
            while(array[end] > pivot) end--;
            if(start <= end) {
                swap(start, end);
                start++;
                end--;
            }
        }

        return start;
    }

    private static void swap(int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

}
