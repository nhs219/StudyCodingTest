package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q16 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i<n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        boolean change = false;
        int count = 0;
        for(int i=1; i<n+1; i++) {
            change = false;
            
            for(int j=0; j<n-i; j++) {
                if(a[j]>a[j+1]) {
                    change = true;

                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

            if(!change) {
                count ++;
            }
        }

        System.out.println(count);
    }
}
