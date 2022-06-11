package cotest.h.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int total = 0;
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(isPrime(num)) {
                total++;
            }
        }

        System.out.println(total);
    }

    private static boolean isPrime(int num) {

        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) return false;
        }
        return num > 1 ? true : false ;
    }
}
