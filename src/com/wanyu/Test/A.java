package com.wanyu.Test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by wanyu on 2018/7/15.
 */
public class A {
    public final StringBuffer s = new StringBuffer("1");
    @Test
    public void test(){
        // 两个通过new生成的Integer变量永远不相等 两个引用 指向地址不同
        //Integer和int比较时，只要数值相等 则二者相等 因为包装类会自动拆箱 实际上就变为两个int的比较
        //非new生成的Integer变量和new生成的变量比较时 结果为false 一个指向常量池中的对象 一个指向堆中的对象
        //两个非new产生的Integer对象 如果两个变量值在-128到127之间 则比较结果为true 否则为false
        //java在编译Integer i=100时会 翻译成 = Integer.valueOf(100) 而valueOf中有IntegerCache
        s.append("A");
        int i = 0;
        Integer j = new Integer(0);//j指向堆中对象
        Integer jj = 0; //jj指向常量池中对象
        Integer jjj = 0;
        System.out.println(i == jj); //装箱拆箱操作
        System.out.println(j == jj);
        System.out.println(jj == jjj);

        String st1 = "hello";
        String str2 = "hel"+ new String("lo");
        System.err.println(st1.equals(str2)); //true System.out 在JVM和操作系统都有缓存功能 输出的东西不一定实时输出
        System.err.println(st1==str2);//false   System.err 会实时输出
    }
    public void test2(){
        List list = new ArrayList<>();
    }
}
