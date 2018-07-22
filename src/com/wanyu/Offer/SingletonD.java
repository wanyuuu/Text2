package com.wanyu.Offer;

/**
 * Created by wanyu on 2018/4/8.
 * 静态内部类 保证实例只能加载一次
 * 需要的时候创建实例
 */
public class SingletonD {
    public static void main(String[] args) {
        SingletonD sing=getInstance();
    }
    private static class SingletonHold{
        private static final SingletonD SINGLETON=new SingletonD();
    }
    private SingletonD(){

    }
    public static final SingletonD getInstance(){
        return SingletonHold.SINGLETON;
    }
}
