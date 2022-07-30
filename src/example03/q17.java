package example03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class q17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        Integer[] A = new Integer[n.length()];
        for(int i = 0; i<n.length(); i++) {
            A[i] = Integer.parseInt(n.substring(i, i+1));
        }
        Arrays.sort(A, Collections.reverseOrder());

        for (Integer a : A) {
            System.out.print(a);
        }
    }
   

}
