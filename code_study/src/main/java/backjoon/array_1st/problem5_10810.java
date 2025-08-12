package backjoon.array_1st;

import java.util.Scanner;

public class problem5_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] baskets = new int[N];

        for (int t = 0; t < M; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int x = i - 1; x <= j - 1; x++) {
                baskets[x] = k;
            }
        }
        for (int x = 0; x < N; x++) {
            System.out.print(baskets[x] + " ");
        }
    }
}
