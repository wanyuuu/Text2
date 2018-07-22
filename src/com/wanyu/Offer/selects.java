package com.wanyu.Offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanyu on 2018/4/10.
 * 查找数组中任意重复的数字 第一个重复的数字
 */
public class selects {
    public static void main(String[] args) {
        int arr[]={2,3,1,0,2,5,6,5,1};
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i&&arr[arr[i]]!=arr[i]){// 交换到正确的位置
                swap(arr,i,arr[i]);
            }
            if (arr[i]!=i&&arr[i]==arr[arr[i]]){//有重复的数
                list.add(arr[i]);
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static void swap(int arr[],int m,int n){
        int tmp=arr[m];
        arr[m]=arr[n];
        arr[n]=tmp;
    }
}
