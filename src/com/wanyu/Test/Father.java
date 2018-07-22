package com.wanyu.Test;

import org.junit.Test;

/**
 * Created by wanyu on 2018/7/17.
 */
public class Father {
    public Father(){
        System.out.println("我是你爸");
    }

    public static void main(String[] args) {
        Son son = new Son(); //父类构造函数 子类对象成员构造函数 子类构造函数
    }
}
class Son extends Father{
    public Son(){
        System.out.println("我是儿子");
    }
    Mom mom = new Mom();
}
class Mom{
    public Mom(){
        System.out.println("我是妈妈");
    }
}
