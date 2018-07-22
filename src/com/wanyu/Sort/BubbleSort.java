package com.wanyu.Sort;

import org.junit.Test;

import java.util.Scanner;

/**
 * Created by wanyu on 2018/3/7.
 * 冒泡算法
 */
public class BubbleSort {
    @Test
    public void BubbleSort(){
        int a[]={9,1,5,8,3,7,4,6,2};
        int length=a.length;//9
        for(int i=0;i<length;i++){ //比较的个数比总数少1
            for(int j=length-2;j>=i;j--){//从倒数第二个开始比
                if(a[j]>a[j+1]){
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    @Test
    public void gaiSort(){//改进 冒泡
        int a[]={2,1,3,4,5,6,7,8,9};
        boolean flag=true;
        for(int i=0;i<a.length-1&&true;i++){
            flag=false;
            for(int j=a.length-2;j>=i;j--){
                if(a[j]>a[j+1]){
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                    flag=true;//若不进行交换了 则flag=false  结束循环
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    @Test
    public void maoSort(){
        int a[]={2,1,3,8,5,6,71,18,9};
        boolean flag=true;
        for(int i=0;i<a.length-1&&flag;i++){
             flag=false;
            for(int j=a.length-2;j>=i;j--){
                if(a[j]>a[j+1]){
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                    flag=true;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
