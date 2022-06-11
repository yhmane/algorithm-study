package cotest.h.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = 0;
        int min = 1000000;
        for(int i = 0; i < num; i++){
            int temp = Integer.parseInt(st.nextToken());

            if (max < temp) {
                max = temp;
            }

            if (min > temp) {
                min = temp;
            }
        }
        System.out.println(min * max);
    }
}
