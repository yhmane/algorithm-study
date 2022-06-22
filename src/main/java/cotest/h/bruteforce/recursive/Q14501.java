package cotest.h.bruteforce.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        int[] day = new int[t + 15];
        int[] pay = new int[t + 15];
        int[] dp = new int[t + 15];
        int max = 0;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            day[i] = Integer.parseInt(st.nextToken());
            pay[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i <= t; i++) {
            dp[i] = Math.max(dp[i], max);

            dp[day[i]+i] = Math.max(dp[day[i]+i], pay[i]+dp[i]);

            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}
