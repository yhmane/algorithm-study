package cotest.h.bruteforce;

import java.util.Scanner;

public class Q9095 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (num-- > 0) {
            System.out.println(getSum(scanner.nextInt()));
        }
    }

    private static int getSum(int num) {
        int[] arr = new int[12];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for (int i = 4; i <= num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        return arr[num];
    }
}
