package backjoon.array_1st;

import java.util.Scanner;

public class problem3_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = -1000001;
        int min = 1000001;
        int[] arr = new int[a];

        for(int i = 0; i<a; i++){
            arr[i] = sc.nextInt();
        }

        for(int i : arr){
            if(i>=max) max = i;
        }
        for(int i : arr){
            if(i<=min) min = i;
        }

        System.out.print(min + " " + max);
    }
}
