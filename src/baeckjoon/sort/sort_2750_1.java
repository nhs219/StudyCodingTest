package baeckjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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

        quickSort(array[0], 1, n-1);

    }

    private static void quickSort(int pivot, int low, int high) {

        while(low < high) {
            if(array[low] < pivot) {
                low++;
            } else {
                break;
            }
        }

        while(low < high) {
            if(array[high] > pivot) {
                high--;
            } else {
                break;
            }
        }

        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;

        System.out.println(Arrays.toString(array));
        
    }

    /**
     * int temp = array[low];
        array[low] = pivot;
        pivot = temp;
     */

}
