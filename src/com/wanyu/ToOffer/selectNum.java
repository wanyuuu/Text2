package com.wanyu.ToOffer;

import java.util.Scanner;

/**
 * Created by wanyu on 2018/6/27.
 */
public class selectNum {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int arr[][] = {
                        {1,4,7,11,15},
                        {2,5,8,12,19},
                        {3,6,9,16,22},
                        {10,13,14,17,24},
                        {18,21,23,26,30}
                      };
        int a = cin.nextInt();
        System.out.println(selectNum(arr,a));
    }
    public static boolean selectNum(int arr[][],int a){
        int i = 0; //行数 4
        int j = arr[0].length-1; //列数 4
        while (i<=arr.length-1&&j>=0){
            if(a == arr[i][j]){
                return true;
            }
            if(a<arr[i][j]){
                j--;
            }else if(a>arr[i][j]){
                i++;
            }else {
                return false;
            }
        }
        return false;
    }
}
