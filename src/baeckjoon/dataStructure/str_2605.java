package baeckjoon.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class str_2605 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i < n+1 ; i++ ) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1 ; i < n+1 ; i++ ) {
            for(int j = 0 ; j < arr[i] ; j++) {
                tempStack.push(stack.pop());
            }
            stack.push(i);
            for(int j = 0 ; j < arr[i] ; j++) {
                stack.push(tempStack.pop());
            }
        }

        for (Integer num : stack) {
            System.out.print(num + " ");
        }
    }
}
