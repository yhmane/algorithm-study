package cotest.h.math;

import java.util.Scanner;

public class Q4375 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println(getOffset(num));
        }
    }

    public static int getOffset(int num) {
        long x = 1;
        for (int i =1;;i++) {
            x = x % num;
            x = x * 10 + 1;
            if (x == 1) {
                return i;
            }
        }
    }
}
