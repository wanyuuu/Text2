package com.wanyu.ToOffer;

/**
 * Created by wanyu on 2018/6/26.
 * 静态内部类
 */
public class SingletonC {
    private static class Singleton{
        private static final SingletonC INSTANCE = new SingletonC();
    }
    /*
     仍保证了初始化instance时只有一个实例 和饿汉不同的是
     饿汉模式只要Singleton类被装载了 那么instance就会被实例化。
     而这种方式类被装载 instance不一定会被实例化，因为Singleton没有被主动使用，只有显示调用getInstance()时
     才会装载该类并初始化。可以实现延迟加载，或减少资源消耗。
     */
    public static final SingletonC getInstance(){
        return Singleton.INSTANCE;
    }
}
