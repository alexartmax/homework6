package com.company;

public class task4var2 {
    public static void main(String[] args) {
        int[][] score = {{10, 11, 12, 13}, {20, 21, 22, 23}, {30, 31, 32, 33}};

        int res1 = score[0][0] + score[0][1] + score[0][2] + score[0][3];
        int res2 = score[1][0] + score[1][1] + score[1][2] + score[1][3];
        int res3 = score[2][0] + score[2][1] + score[2][2] + score[2][3];

        int[] result = {res1, res2, res3};
    }
}