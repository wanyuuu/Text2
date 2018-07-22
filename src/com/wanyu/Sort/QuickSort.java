package com.wanyu.Sort;

/**
 * Created by wanyu on 2018/3/13.
 */
public class QuickSort {
    public static void main(String[] args) {
        int a[]={0,8,2,10,4,6,5,15,11,4};
        quickSort(a,1,a.length-1);
        for(int i=1;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void quickSort(int a[],int low,int high){
        if (low<high){//必须是if
            int mid=Partition(a,low,high);
            quickSort(a,low,mid-1);
            quickSort(a,mid+1,high);
        }
    }
    public static int Partition(int a[],int low,int high){
//        int mid=a[low+(high-low)/2];//取第一个数做中间数 之前的数都小于等于它 之后的数都大于等于它
//        int m=low+(high-low)/2;//优化
//        if(a[m]>a[high]){
//            swap(a,m,high);
//        }
//        if(a[m]<a[low]){
//            swap(a,m,low);
//        }
//        if(a[low]>a[high]){
//            swap(a,low,high);
//        }
        int mid=a[low];
        while(low<high){
            while(low<high&&a[high]>=mid){
                high--; //若大于中间数 则向前移动一位 继续比较
            }
            swap(a,low,high); //小于中间数 循环结束 交换位置
            while(low<high&&a[low]<=mid){
                low++;
            }
            swap(a,low,high);
        }
        return low;//直到low high相等退出循环
    }
    public static void swap(int a[],int i,int j){
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
}
