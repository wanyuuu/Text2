package com.wanyu.ToOffer;

/**
 * Created by wanyu on 2018/6/27.
 * 双重校验锁 真正实现单例
 */
public class SingletonD {
    private static SingletonD instance;
    public SingletonD(){

    }
    public static SingletonD getInstance(){
        if(instance == null){
            synchronized (SingletonD.class){
                if(instance == null){
                    instance = new SingletonD();
                }
            }
        }
        return instance;
    }
}
