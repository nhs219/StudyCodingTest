package book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinarySearch {
    private static int[] array;
    private static int count;
    private static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
    
        StringTokenizer st = new StringTokenizer(br.readLine());
        array = new int[n];

        for(int i=0; i<n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        count = 0;
        search(0, n-1);
    
    }

    private static void search(int start, int end) {
        int midPoint = (start + end) / 2;
        int midNum = array[midPoint];
        count++;

        if(midNum == m) {
            System.out.println("result :: " + count);
        }else if(midNum < m){
            search(midPoint+1, end);
        }else {
            search(start, midPoint-1);
        }
    }
  
}
