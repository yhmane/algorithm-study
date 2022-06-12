package cotest.h.bruteforce;

import java.util.Scanner;

public class Q15650 {

    static int N;
    static int M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        arr = new int[M];

        dfs(1, 0);
        System.out.println(sb);
    }

    static void dfs(int start, int depth) {
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = start; i <= N; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}
