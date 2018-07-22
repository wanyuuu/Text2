package com.wanyu.Cc;

import java.util.Scanner;

/**
 * Created by wanyu on 2018/4/1.
 * 深搜
 */
public class A {
   static int arr[][]={{13,10,10,3,11},
                        {13,5,5,11,8},
                        {10,10,10,41,41},
                         {2,2,10,10,33},
                        {13,10,13,22,24}};
   static int idx[][]=new int[arr.length][arr.length];
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int x=cin.nextInt();//横坐标
        int y=cin.nextInt();//纵坐标
        findConnected(arr,arr.length,x,y);
    }
    public static void findConnected(int array[][],int n,int x,int y){
        int num=array[x][y];
        setPrint(x,y,num);
    }
    public static void setPrint(int m,int n,int num){
        if(m<0||m>=arr.length||n<0||n>=arr.length){
            return ; //出界
        }
        if(idx[m][n]>0||arr[m][n]!=num){ //访问过或不是num
            return ;
        }
        idx[m][n]=1; //标记已经访问过
        System.out.println("("+m+","+n+")");
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                if((i!=0||j!=0)&&Math.abs(i)!=Math.abs(j)){//上下左右四个点
                    setPrint(m+i,n+j,num);
                }
            }
        }
    }
}
