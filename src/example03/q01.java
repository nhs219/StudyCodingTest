package example03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class q01 {

    /**
     * N값 입력
     * 숫자 N개 String형으로 입력 받음
     * String형을 char[]로 변환
     * for {
     *     sum += char[i]
     * }
     * sum 출력
     */

    public static void main (String args[]) throws IOException {
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // String stringNum = in.next();
        // char[] charNum = stringNum.toCharArray(); //toCharArray는 intellij아니면... 몰랐다
        // int sum = 0;

        // for (char c : charNum) {
        //     sum += c - '0'; // 마이너스 '0'은 책 보고 함...
        // }
        // System.out.println(sum);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] cNum = new char[N];
        cNum = br.readLine().toCharArray();
        int result = 0;
        for(char num : cNum) {
            result += num - '0';
        }

        System.out.println(result);
    }

}
