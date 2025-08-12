package backjoon.array_1st;

import java.util.Scanner;
public class problem1_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int a = sc.nextInt();
        int[] arr = new int[a];

        for(int i = 0; i<a; i++){
            arr[i] = sc.nextInt();
        }

        int b = sc.nextInt();

        for(int i = 0; i<a; i++){
            if(b == arr[i]) num++;
        }

        System.out.println(num);

    }

}


