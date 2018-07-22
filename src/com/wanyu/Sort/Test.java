package com.wanyu.Sort;

/**
 * Created by wanyu on 2018/3/12.
 */
public class Test {
   static int a;
    static byte b;
    static char c;
    static  short s;
    static  boolean bool;
    static String str;
    static  float f;
    static  double d;
    static long l;
    public static void main(String[] args) {//方法中变量必须初始化才能使用 类中变量可以不初始化
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(bool);
        System.out.println(str);
        System.out.println(f);
        System.out.println(d);
        System.out.println(l);
    }
    public void main(){
        float []f[]=new float[2][];
      //  float f[][]=new float[][2];
    }
    @org.junit.Test
    public void test(int a,int b){
        int c,d;
        c=a;d=b;
        int i=2;
        switch (i){
            case 1:
                System.out.println(3);
            case 2:
                System.out.println(4);
            case 3:
                System.out.println(5);
        }
    }
}
