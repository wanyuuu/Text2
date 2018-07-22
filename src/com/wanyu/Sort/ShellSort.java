package com.wanyu.Sort;

import org.junit.Test;

/**
 * Created by wanyu on 2018/3/9.
 * 希尔排序 和插入法类似
 */
public class ShellSort {
    @Test
    public void ShellSort(){
        int a[]={0,9,1,5,8,3,7,4,6,2};
        int increment=a.length-1;//初始化增量
        do{
            increment=increment/3+1;//增量序列
            for(int i=increment+1;i<a.length;i++){
                if(a[i]<a[i-increment]){
                    a[0]=a[i];   //哨兵 存储小数
                    int j=0;
                    for(j=i-increment;j>0&&a[j]>a[0];j-=increment){
                        a[j+increment]=a[j];  //将前面大的数交换到后面
                    }
                    a[j+increment]=a[0];
                }
            }
        }while (increment>1);
        for(int i=1;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    @Test
    public void shellSort(){
        int a[]={0,8,9,4,7,2,3,6,1,5};
        int increment=a.length-1;
        do {
            increment=increment/3+1;
            for(int i=increment+1;i<a.length;i++){
                if(a[i]<a[i-increment]){
                    a[0]=a[i];
                    int j=0;
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
