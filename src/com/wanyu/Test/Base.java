package com.wanyu.Test;

import org.junit.Test;

/**
 * Created by wanyu on 2018/7/21.
 */
public class Base {
    /*
        初始化父类的静态变量、静态代码块 按照出现顺序
        初始化子类的静态变量、静态代码块
        初始化父类的成员变量
        执行父类的构造代码块
        执行父类的构造函数
        执行子类的成员变量
        执行子类的构造代码块
        执行子类的构造函数
     */
    private String name = "base";
    private static int a = 1;
    {
        System.out.println(a);
        System.out.println("父类的构造代码块");
    }
    public Base(){
        System.out.println(name); //1
        outOk(); //2 走儿子中的方法 子类尚未初始化
    }
    static{
        System.out.println(a);
        System.out.println("父类的静态代码块");
        a++;
    }
    public void outOk(){
        System.out.println(name+"ok");
    }

    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.name);
        base.outOk();
    }
}
class Sub extends Base{
    private String name = "sub";//加static 即可在父类构造函数前初始化
    public Sub(){
        System.out.println(name);// 3
    }
    {
       System.out.println("子类的构造代码块");
    }
    static {
        System.out.println("子类的静态代码块");
    }
    public void outOk(){
        System.out.println(name+"ok");
    }
}
