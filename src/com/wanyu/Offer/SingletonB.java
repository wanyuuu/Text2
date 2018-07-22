package com.wanyu.Offer;

/**
 * Created by wanyu on 2018/4/8.
 * 饿汉模式 类加载时初始化
 */
public class SingletonB {
    public static void main(String[] args) {

    }
    private static SingletonB singleton=new SingletonB();
    private SingletonB(){

    }
    public static SingletonB getInstance(){
        return singleton;
    }
}
