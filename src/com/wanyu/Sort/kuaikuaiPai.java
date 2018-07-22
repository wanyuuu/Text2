package com.wanyu.Sort;

/**
 * Created by wanyu on 2018/3/14.
 */
public class kuaikuaiPai {
    public static void main(String[] args) {
        int a[] = {0,5,4,9,6,7,1,1};
        quickSort(a, 1, a.length - 1);
        for (int i = 1; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void quickSort(int a[], int low, int high) {

        if (low < high) {
            int mid = getMid(a, low, high);
            quickSort(a, low, mid - 1);
            quickSort(a, mid + 1, high);
        }
    }

    public static int getMid(int a[], int low, int high) {
        int mid = a[low];
        while (low < high) {
            while (low < high && a[high] >= mid) {
                high--;
            }
            swap(a, low, high);
            while (low < high && a[low] <=mid) {
                low++;
            }
            swap(a, low, high);
        }
        return low;

    }


    public static void swap(int a[], int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j]=tmp;
    }
}
