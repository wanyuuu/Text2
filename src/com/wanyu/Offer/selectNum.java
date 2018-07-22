package com.wanyu.Offer;

/**
 * Created by wanyu on 2018/4/10.
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * [1,   4,  7, 11, 15],
 *[2,   5,  8, 12, 19],
 *[3,   6,  9, 16, 22],
 *[10, 13, 14, 17, 24],
 *[18, 21, 23, 26, 30]
 */
public class selectNum {
    public static void main(String[] args) {
        int arr[][]={{1,4,7,11,15},
                    {2,5,8,12,19},
                    {3,6,9,16,22},
                    {10,13,14,17,24},
                    {18,21,23,26,30}
        };
        int shu=33;
        int i=0;
        int m=arr.length;
        int n=arr[0].length;
        while(i<=m-1&&n-1>=0){
            if(arr[i][n-1]==shu){
                System.out.println("存在");
                break;
            }else {
                if(arr[i][n-1]>shu){
                    n--;
                }else {
                    i++;
                }
            }
        }
    }
}
