package com.wanyu.Offer;

import java.util.Scanner;

/**
 * Created by wanyu on 2018/4/9.
 */
public class replace {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String str=cin.nextLine();
        int sum=0;
       for(int i=0;i<str.length();i++){
          String s= String.valueOf(str.charAt(i));
           if(s.equals(" ")){
               sum++;
           }
       }
        int newlength=sum*2+str.length();
        char arr[]=new char[newlength];
        for(int i=0,j=0;i<newlength;i++){
            char c=str.charAt(j);
            if(c!=' '){
                arr[i]=c;
            }else {
                arr[i]='2';
                arr[i+1]='0';
                arr[i+2]='%';
                i=i+2;
            }
            j++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
