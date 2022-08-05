package example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i = n ; i <= m ; i++) {
            queue.add(i);
        }

        for (Integer num : queue) {
            if(num % 2 == 0) {
                queue.remove();
            }
        }

        System.out.println();
    }
}
