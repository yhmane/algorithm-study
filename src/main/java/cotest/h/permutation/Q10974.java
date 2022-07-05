package cotest.h.permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10974 {

    private static int N;
    private static int arr[];
    private static boolean isSelected[];
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        isSelected = new boolean[N];

        perm(0);
        System.out.println(sb);
    }

    private static void perm(int count) {
        if (count == N) {
            for (int i = 0; i < N; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (isSelected[i]) {
                continue;
            }
            arr[count] = i + 1;
            isSelected[i] = true;
            perm(count + 1);
            isSelected[i] = false;
        }
    }
}
