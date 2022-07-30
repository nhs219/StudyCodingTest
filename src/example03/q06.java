package example03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q06 {
    /**
     * N을 입력받는다.
     *
     * for(N) {
     *     NUM[]에 1~N까지 저장
     * }
     *
     * int sum = 0;
     *
     * for(i) {
     *     for(j) {
     *         sum = NUM[i] + NUM[j]
     *         if(sum==N) {
     *             count++;
     *         }if(sum>N) {
     *             break;
     *         }
     *     }
     * }
     */

    // 코드가 쓰레기...
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 0;

        for(int i=1; i<=N ; i++) {
            int sum =0;
            for (int j=i; j<=N; j++) {

                if(i==j) {
                    sum += i;
                } else {
                    sum += j;
                }

                if(sum == N) {
                    count ++;
                } else if(sum >N) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
