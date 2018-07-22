package com.wanyu.Sort;

import org.junit.Test;

/**
 * Created by wanyu on 2018/3/9.
 * 插入排序
 */
public class InsertSort {
    @Test
    public void InsertSort(){
        int a[]={0,5,3,4,6,2};
        for(int i=2;i<a.length;i++){// a[0]做哨兵 默认第一个数放好位置 所以从第二个开始
            if(a[i]<a[i-1]){
                a[0]=a[i];//把小的数存起来 做哨兵
                int j=0;
                for( j=i-1;a[j]>a[0];j--){
                    a[j+1]=a[j];//往后移动
                }
                a[j+1]=a[0];//将哨兵中的数存在空位上
            }
        }
        for(int i=1;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    @Test
    public void insertSort(){
        int b[]={0,8,1,5,9,20,4};
        for(int i=2;i<b.length;i++){
            if(b[i]<b[i-1]){
                b[0]=b[i];
                int j=0;
                for(j=i-1;b[j]>b[0];j--){
                    b[j+1]=b[j];
                }
                b[j+1]=b[0];
            }
        }
        for(int i=1;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
    @Test
    public void chaSort(){
        int a[]={0,5,3,4,6,2};
        for(int i=2;i<a.length;i++){
            if(a[i]<a[i-1]){
                a[0]=a[i];//保存小的一会用
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
    @Test
    public void xxinSort(){
        int a[]={0,5,3,4,6,2};
        for(int i=2;i<a.length;i++){
            if(a[i]<a[i-1]){
                a[0]=a[i];
                int j=0;
                for(j=i-1;a[j]>a[0];j--){
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
