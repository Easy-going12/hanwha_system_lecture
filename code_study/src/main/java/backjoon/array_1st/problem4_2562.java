package backjoon.array_1st;

import java.util.Scanner;

public class problem4_2562 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int count = 0;

        for (int i = 0; i < 9; i++) {
            int b = sc.nextInt();
            if(b>=max){
                max = b;
                count = i;
            }
        }

        System.out.println(max);
        System.out.println(count+1);
    }
}
