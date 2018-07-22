package com.wanyu.Cc;

/**
 * Created by wanyu on 2018/3/31.
 */
public class quickSort2 {
    public static void main(String args[]){
        int a[]={7,1,6,5,4,2,9};
        sort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void sort(int a[],int start,int end){
        if(start<end){
            int mid=getMid(a,start,end);
            sort(a,start,mid-1);
            sort(a,mid+1,end);
        }
    }
    public static int getMid(int a[],int start,int end){
        int shu=a[start];
        while(start<end) {
            while (start < end && a[end] >= shu) {
                end--;
            }
            swap(a, start, end);
            while (start < end && a[start] <= shu) {
                start++;
            }
            swap(a, start, end);
        }
        return start;
    }
    public static void swap(int a[],int i,int j){
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
}
