package com.wanyu.Sort;

import org.junit.Test;

/**
 * Created by wanyu on 2018/3/9.
 * 简单选择排序
 */
public class SelectSort {
    @Test
    public void SelectSort(){
        int a[]={9,1,5,8,3,7,4,6,2};
        for(int i=0;i<a.length-1;i++){//最后一个不用比较
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){//每轮比较出最小值
                    min=j;  //获取了最小值的下标
                }
            }
            if(min!=i){
                int tmp=a[min];//将最小值交换到前面
                a[min]=a[i];
                a[i]=tmp;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    @Test
    public void xuanSort(){
        int a[]={9,2,5,8,3,7,4,6,1};
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;//获取最小值下标
                }
            }if(min!=i){
                int tmp=a[min];
                a[min]=a[i];
                a[i]=tmp;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
