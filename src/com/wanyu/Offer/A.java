package com.wanyu.Offer;

/**
 * Created by wanyu on 2018/4/2.
 * leetcode第一题
 */
public class A {
    public static void main(String[] args) {
        int number[]={3,2,4,5,9,2};
       int arr[]= twoSum(number,6);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
    public static int[] twoSum(int[] numbers, int target) {
        int a[]=new int[2];
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    a[0]=i+1;
                    a[1]=j+1;
                }
            }
        }
        return a;
    }
}
