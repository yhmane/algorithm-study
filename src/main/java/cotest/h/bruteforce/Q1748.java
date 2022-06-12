package cotest.h.bruteforce;

import java.util.Scanner;

public class Q1748 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 1;
        int length = 10;
        long tot = 0;
        for (int i  = 1; i <= n; i++) {
            if (i == length) {
                count++;
                length *= 10;
            }
            tot += count;
        }
        System.out.println(tot);
    }
}
