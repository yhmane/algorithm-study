package cotest.h.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2309 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);

        int miss1 = 0;
        int miss2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    miss1 = arr[i];
                    miss2 = arr[j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (miss1 == arr[i] || miss2 == arr[i]) {
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
