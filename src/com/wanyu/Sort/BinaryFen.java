package com.wanyu.Sort;

import java.util.Arrays;

/**
 * Created by wanyu on 2018/3/13.
 */
public class BinaryFen {
    public static void main(String[] args) {
        int a[]={23,1,4,6,11,9};
        Arrays.sort(a);
//        System.out.println(Arrays.binarySearch(a,1));  jdk查找
        System.out.println(erFen(a,1));
    }
    public static int erFen(int a[],int key){
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
