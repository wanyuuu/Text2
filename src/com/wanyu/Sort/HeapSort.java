package com.wanyu.Sort;

import org.junit.*;

/**
 * Created by wanyu on 2018/3/13.
 */
public class HeapSort {
    public static void main(String[] args) {
        int a[]={0,50,10,90,30,70,40,80,60,20};
        HeapSort(a);
        for(int i=1;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
   static public void HeapSort(int a[]){
        int i;
       for(i=a.length/2-1;i>0;i--){
           HeapAdjust(a,i,a.length-1);//从父节点循环 来构建大顶堆
       }
       for(i=a.length-1;i>1;i--){
           swap(a,1,i);  //将堆顶记录和最后一个进行交换
           HeapAdjust(a,1,i-1);//调整交换后的堆顶 重新构建大顶堆
       }
    }
   static public void HeapAdjust(int a[],int i,int m){
        int tmp,j;
       tmp=a[i]; //父节点
       for(j=2*i;j<=m;j*=2){ //j<m 说明不是最后一个子节点
          if(j<m&&a[j]<a[j+1]){
              ++j;//移到下一个节点
          }
           if(tmp>=a[j]){
               break;  //父节点大于两个子节点 则序列不变 继续循环
           }
           /*
              30
            / \
          60  20
          */
           a[i]=a[j];//把60放到30那
           i=j;  //60坐标给i
       }
       a[i]=tmp;//把30插入到60的位置

    }
   static public void swap(int a[],int i,int j){
        int tmp=a[i];
       a[i]=a[j];
       a[j]=tmp;
    }
}
