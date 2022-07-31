package example;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class q13 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> myQueue = new LinkedList();
        for(int i=0; i<n; i++) {
            myQueue.add(i);
        }

        while(myQueue.size() > 1) {
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }

        System.out.println(myQueue.poll());

        br.close();
    }
}
