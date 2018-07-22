package com.wanyu.ToOffer;

import com.wanyu.Offer.SingletonB;

/**
 * Created by wanyu on 2018/6/26.
 * 单例模式确保一个类只有一个实例 且自行实例化并向整个系统提供这个实例
 */
public class SingletonA {
    private static SingletonA instance;
    public SingletonA(){

    }
    public static synchronized SingletonA getInstance(){
        /*懒汉模式 适用于多线程 因为锁 效率低
          比较懒 类加载时不创建实例 因此类加载速度快 但运行时获取对象的速度慢
        */
        if(instance == null){
            instance = new SingletonA();
        }
        return instance;
    }
}
