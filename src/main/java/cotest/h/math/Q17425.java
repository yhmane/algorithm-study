package cotest.h.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q17425 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());

        long f[] = new long[1000001];
        long g[] = new long[1000001];
        Arrays.fill(f, 1);

        for (int i = 2; i < f.length; i++) {
            for (int j = 1; i * j < f.length; j++) {
                f[i * j] += i;
            }
        }

        for (int i = 1; i < g.length; i++) {
            g[i] += g[i - 1] + f[i];
        }

        while (t-- > 0) {
            int num = Integer.parseInt(br.readLine());
            sb.append(g[num]).append("\n");
        }
        System.out.println(sb);
    }
}
