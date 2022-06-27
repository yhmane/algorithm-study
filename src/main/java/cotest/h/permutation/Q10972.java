package cotest.h.permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10972 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (nextPermutation(arr)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(arr[i]).append(" ");
            }
            System.out.println(sb);
        } else {
            System.out.println(-1);
        }

    }

    private static boolean nextPermutation(int[] arr) {
        int i = arr.length-1;

        while(i > 0 && arr[i-1] >= arr[i]) {
            i--;
        }
        if (i <= 0) {
            return false;
        }

        int j = arr.length-1;

        while(arr[j] <= arr[i-1]) {
            j--;
        }

        swap(arr, i-1, j);
        j = arr.length - 1;
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        return true;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
