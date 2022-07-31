package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q07 {

    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int M = in.nextInt();
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0; i<N; i++) {
//            list.add(in.nextInt());
//        }
//        Collections.sort(list);
//        int count = 0;
//
//        for(int start=0; start<N; start++) {
//            for (int end=start+1; end<N; end++) {
//                int sum = list.get(start) + list.get(end);
//                if(sum == M) {
//                    count ++;
//                }
//            }
//        }
//
//        System.out.println(count);



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K=0;
        while(st.hasMoreTokens()) {
            A[K] = Integer.parseInt(st.nextToken());
            K++;
        }
        Arrays.sort(A);

        int count = 0;
        int i = 0;
        int j = N-1;

//        while (i<j) {
//            if (A[i] + A[j] < M) {
//                i++;
//            } else if(A[i] + A[j] >M) {
//                j--;
//            } else {
//                count ++;
//                i++;
//                j--;
//            }
//        }

        System.out.println(count);
        br.close();

    }

}
