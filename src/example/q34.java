package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class q34 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int oneCount = 0;
        int zeroCount = 0;
        PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusPq = new PriorityQueue<>();

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if(num == 0) {
                zeroCount++;
            } else if(num == 1) {
                oneCount++;
            } else if(num > 0) {
                plusPq.add(num);
            } else {
                minusPq.add(num);
            } 
        }
        int sum = 0;

        while(plusPq.size() > 1) {
            int first = plusPq.remove();
            int second = plusPq.remove();
            sum += (first * second);
        }
        if(!plusPq.isEmpty()) {
            sum = sum + plusPq.remove();
        }

        while(minusPq.size() > 1) {
            int first = minusPq.remove();
            int second = minusPq.remove();
            sum += (first * second);
        }

        if(!minusPq.isEmpty()) {
            if (zeroCount == 0) {
                sum = sum + minusPq.remove();
            }
        }

        sum = sum + oneCount;
        System.out.println(sum);
    }
}
