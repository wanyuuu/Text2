package com.wanyu.Cc;

/**
 * Created by wanyu on 2018/3/31.
 */
public class select2 {
    public static void main(String[] args) {
        int a[]={4,5,1,2,8,6,4,9};
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            if(min!=i){
                int tmp=a[i];
                a[i]=a[min];
                a[min]=tmp;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
