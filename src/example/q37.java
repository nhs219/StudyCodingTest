package example;

import java.util.HashMap;
import java.util.Scanner;

public class q37 {
    private static HashMap<Integer, Integer> map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] array = new int[m-n+1];

    }

    private static void remove(int key, int num) {
        if(map.get(key) % num == 0) {
            map.remove(key);
        }
    }
}
