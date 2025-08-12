package backjoon.array_1st;

import java.util.Scanner;

public class problem8_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt() % 42;
        }

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                count++;
            }
        }

        System.out.println(count);
    }
}
