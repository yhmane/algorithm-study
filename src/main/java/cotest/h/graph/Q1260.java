package cotest.h.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1260 {

    static int N, M, V;
    static int map[][];
    static boolean visited[];
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N       = Integer.parseInt(st.nextToken());
        M       = Integer.parseInt(st.nextToken());
        V       = Integer.parseInt(st.nextToken());
        map     = new int[N+1][N+1];
        visited = new boolean[N+1];

        int x, y;
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            x  = Integer.parseInt(st.nextToken());
            y  = Integer.parseInt(st.nextToken());
            map[x][y] = 1;
            map[y][x] = 1;
        }

        sb = new StringBuilder();
        dfs(V);
        sb.append("\n");
        visited = new boolean[N+1];
        bfs(V);
        System.out.println(sb);
    }

    public static void dfs(int v) {
        visited[v] = true;
        sb.append(v).append(" ");

        for(int i = 1; i < N + 1; i++) {
            if(map[v][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);

        int next;
        visited[v] = true;
        while(!queue.isEmpty()) {
            next = queue.poll();
            sb.append(next).append(" ");

            for(int i = 1; i < N + 1; i++) {
                if(map[next][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i]=true;
                }
            }
        }
    }
}