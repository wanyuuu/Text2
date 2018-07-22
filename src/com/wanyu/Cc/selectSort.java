package com.wanyu.Cc;

/**
 * Created by wanyu on 2018/3/19.
 */
public class selectSort {
    public static void main(String[] args) {
        int a[]={5,6,4,1,7,2,1,9,10,9};
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;  //找到最小的数的位置
                }
            }if(min!=i) {
                int tmp = a[i];
                a[i] = a[min];
                a[min] = tmp;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
