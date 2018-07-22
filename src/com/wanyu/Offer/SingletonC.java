package com.wanyu.Offer;

/**
 * Created by wanyu on 2018/4/8.
 * 多线程 两个线程创建一个实例 双重效验锁
 */
public class SingletonC {
    public static void main(String[] args) {
        Thread t1=new Ta();
        t1.start();
        Thread t2=new Tb();
        t2.start();
    }
    private volatile static SingletonC singleton;
    private SingletonC(){

    }
    public static SingletonC getInstance(){
        if(singleton==null){ //保证只加一次锁 减少耗时
            synchronized(SingletonC.class){ //判断实例是否已经创建 若没有则加锁
                if(singleton==null) {
                    singleton = new SingletonC();
                }
            }
        }
        return singleton;
    }
}
class Ta extends Thread{
    @Override
    public void run() {
        SingletonC s1=SingletonC.getInstance();
        System.out.println(s1);
    }
}
class Tb extends Thread{
    @Override
    public void run() {
        SingletonC s1=SingletonC.getInstance();
        System.out.println(s1);
    }
}