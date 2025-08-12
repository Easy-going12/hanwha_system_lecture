package com.ohgiraffers.section02.looping;

public class B_nestedfor {
    public void printGugudanFromTwoToNine() {
        for(int i = 1; i<=5; i++){
            for(int j = 0; j<5-i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }


        /*. 설명.
         *  2단
         *    2 * 1 = 2
         *    2 * 2 = 4
         *    ...
         *   9단
         *    9 * 1 = 9
         *    9 * 2 = 18
         *    ...
         *    9 * 9 = 81
        * */
        for (int dan = 2; dan < 10 ; dan++) {
            System.out.println(dan + "단");
            pringGugudan(dan);
            System.out.println("=============");
        }
    }

    /* 설명. 단수가 넘어오면 해당 단수의 구구단 출력을 담당하는 메소드 */
    private static void pringGugudan(int dan) {
        for (int su = 1; su < 10 ; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    /* 설명. 별찍기 */
    /* 설명.
     *      *
     *     **
     *    ***
     *   ****
     *  *****
    * */

}
