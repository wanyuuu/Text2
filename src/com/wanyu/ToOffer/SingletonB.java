package com.wanyu.ToOffer;

/**
 * Created by wanyu on 2018/6/26.
 */
public class SingletonB {
    private static SingletonB instance = new SingletonB();
    public SingletonB(){

    }
    public static SingletonB getInstance(){
        /*
        饿汉单例模式 在类加载时就完成初始化 所以类加载较慢 但获取对象速度较快
         */
        return instance;
    }
}
