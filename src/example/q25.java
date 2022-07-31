package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class q25 {
    static boolean visited[];
    static ArrayList<Integer>[] A;
    static boolean arrive;
    
    public static void main(String[] args) throws IOException {
        arrive = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        A = new ArrayList[n];
        visited = new boolean[n];
        for(int i=0; i<n; i++) {
            A[i] = new ArrayList<Integer>();
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        for(int i=0; i<n; i++) {
            DFS(i,1);
            if(arrive) {
                break;
            }

        }
        if (arrive) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static void DFS(int now, int depth) {
        if (depth == 5 || arrive) {
            arrive = true;
            return;
        }

        visited[now] = true;
        for (int i : A[now]) {
            if(!visited[i]) {
                DFS(i, depth + 1);
            }
        }
        visited[now] = false;
    }
}
