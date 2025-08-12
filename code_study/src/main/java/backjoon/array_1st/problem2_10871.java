package backjoon.array_1st;

import java.util.Scanner;

public class problem2_10871 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        int[] arr = new int[a];
        int[] num = new int[a];

        for(int i = 0; i<a; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<a; i++){
            if(arr[i] < b){
                num[count] = arr[i];
                count++;
            };
        }

        for(int i = 0; i<num.length; i++){
            if(num[i] == 0) break;
            System.out.print(num[i] + " ");
        }


    }
}
