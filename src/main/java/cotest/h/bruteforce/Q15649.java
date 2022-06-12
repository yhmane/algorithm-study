package cotest.h.bruteforce;


import java.util.Scanner;

public class Q15649 {

    static boolean[] visit;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        visit = new boolean[N];
        arr = new int[M];
        dfs(N, M, 0);
        System.out.println(sb);
    }

    static void dfs(int n, int m, int depth) {
        if (depth == m) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visit[i] == false) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(n, m, depth + 1);
                visit[i] = false;
            }
        }
    }
}
