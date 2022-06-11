package cotest.h.math;

import java.util.Scanner;

public class Q17427 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long tot = 0;
        for (int i = 1; i <= n; i++) {
            tot += i * (n / i);
        }
        System.out.println(tot);
    }
}
