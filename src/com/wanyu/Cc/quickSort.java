package com.wanyu.Cc;

/**
 * Created by wanyu on 2018/3/19.
 */
public class quickSort {
    public static void main(String[] args) {
        int a[]={0,5,2,9,4,15,10,1,3};
        quickSort(a,1,a.length-1);
        for(int i=1;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void quickSort(int a[],int start,int end){
        if(start<end){
            int mid=getMid(a,start,end);
            quickSort(a,start,mid-1);
            quickSort(a,mid+1,end);
        }
    }
    public static int getMid(int a[],int start,int end){
        int mid=a[start];
        while(start<end){
            while(start<end&&a[end]>=mid){
                end--;
            }
            swap(a,start,end);
            while(start<end&&a[start]<=mid){
                start++;
            }
            swap(a,start,end);
        }
        return start;
    }
    public static void swap(int a[],int i,int j){
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
}
