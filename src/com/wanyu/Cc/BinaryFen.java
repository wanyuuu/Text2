package com.wanyu.Cc;

import java.util.Arrays;

/**
 * Created by wanyu on 2018/3/31.
 */
public class BinaryFen {
    public static void main(String[] args) {
        int a[]={5,1,2,4,9,10,6,7};
        Arrays.sort(a);
        System.out.println(binary(a,4));
    }
    public static int binary(int a[],int key){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(key<a[mid]){
                high=mid-1;
            }else if(key>a[mid]){
                low=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
