package com.wanyu.Sort;


import org.junit.*;

/**
 * Created by wanyu on 2018/3/14.
 */
public class XierSort {
    @org.junit.Test
    public void test(){
        int a[]={0,20,11,1,2,15,9,8,7,10};
        int increment=a.length-1;
        do {
            increment=increment/3+1;
            for(int i=increment+1;i<a.length;i++){
                if(a[i]<a[i-increment]){
                    a[0]=a[i];
                    int j;
                    for(j=i-increment;j>0&&a[j]>a[0];j-=increment){
                        a[j+increment]=a[j];
                    }
                    a[j+increment]=a[0];
                }
            }
        }while (increment>1);
        for(int i=1;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
