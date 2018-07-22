package com.wanyu.Offer;

/**
 * Created by wanyu on 2018/4/8.
 * 懒汉 类加载时不初始化 只适用于单线程环境
 */
public class SingletonA {
    public static void main(String[] args) {
//        SingletonA singleton=getInstance();
//        SingletonA s2=getInstance();  //为同一个实例
//        System.out.println(singleton);
//        System.out.println(s2);
        for(int i=0;i<2;i++) {
            Thread thread = new Thread( new Runnable() {
                @Override
                public void run() {
                    SingletonB singleton = SingletonB.getInstance();
                    System.out.println(singleton);
                    //在两个线程同一时刻getInstance时，会创造两个不同的实例 很难测试到同一时刻
                }
            });
            thread.start();
        }
    }
    private static SingletonA singleton;
    private SingletonA(){ //确保只创建一个实例

    }
    public static SingletonA getInstance(){
        if(singleton==null){
            singleton=new SingletonA();
        }
        return singleton;
    }
}
