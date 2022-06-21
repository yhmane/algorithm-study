package cotest.h.bruteforce.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1759 {

    static char[] arr;
    static char[] answer;
    static int l;
    static int c;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        answer = new char[l];
        arr = new char[c];



        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(arr);
        dfs(0, 0);
        System.out.println(sb);
    }

    public static void dfs(int start, int index) {
        if (index == l) {
            int vowelCount = 0;
            int consantCount = 0;
            StringBuilder sub = new StringBuilder();
            for (char a : answer) {
                if ('a' == a || 'e' == a || 'i' == a || 'o' == a || 'u' == a) {
                    vowelCount++;
                } else {
                    consantCount++;
                }
                sub.append(a);
            }

            if (vowelCount >= 1 && consantCount >= 2) {
                sb.append(sub).append('\n');
            }
            return;
        }

        for (int i = start; i < c; i++) {
            answer[index] = arr[i];
            dfs(i + 1, index + 1);
        }
    }
}
