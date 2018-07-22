package com.wanyu.Cc;

/**
 * Created by wanyu on 2018/3/31.
 */
public class InsertSort {
    public static void main(String[] args) {
        int a[]={0,4,5,9,5,4,3,1,10,11};
        for(int i=2;i<a.length;i++){
            if(a[i]<a[i-1]){
                a[0]=a[i];
                int j=0;
                for( j=i-1;a[j]>a[0];j--){
                    a[j+1]=a[j];
                }
                a[j+1]=a[0];
            }
        }
        for(int i=1;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
