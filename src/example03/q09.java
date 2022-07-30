package example03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q09 {
    static int[] checkArr; // 입력 받는 배열
    static int[] myArr; // 현재 문자 개수
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken()); // n입력
        int P = Integer.parseInt(st.nextToken()); // m입력
        int Result = 0;
        char[] A = new char[S];
        checkArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;


        A = br.readLine().toCharArray(); // A입력
        st = new StringTokenizer(br.readLine());

        int i=0;
        while(st.hasMoreTokens()) {
            checkArr[i] = Integer.parseInt(st.nextToken()); // 입력
            if (checkArr[i] == 0) {
                checkSecret++;
            }
            i++;
        }

        for (int j=0; j<P; j++) {
            Add(A[j]);
        }

        if(checkSecret == 4) {
            Result++;
        }

        for (int j=P; j<S; j++) {
            int k = j-P;
            Add(A[j]);
            Remove(A[k]);
            if (checkSecret == 4) {
                Result++;
            }
        }

        System.out.println(Result);
        br.close();

    }

    private static void Add(char c) {
        switch(c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) {
                    checkSecret++;
                }
                break;
            
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) {
                    checkSecret++;
                }
                break;

            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) {
                    checkSecret++;
                }
                break;

            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) {
                    checkSecret++;
                }
                break;
        }
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if(myArr[0] == checkArr[0]) {
                    checkSecret--;
                }
                myArr[0]--;
                break;
            
            case 'C':
                if(myArr[1] == checkArr[1]) {
                    checkSecret--;
                }
                myArr[1]--;
                break;
                
            case 'G':
                if(myArr[2] == checkArr[2]) {
                    checkSecret--;
                }
                myArr[2]--;
                break;

            case 'T':
                if(myArr[3] == checkArr[3]) {
                    checkSecret--;
                }
                myArr[3]--;
                break;
            

        }
    }
}
