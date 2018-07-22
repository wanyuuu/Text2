package com.wanyu.Offer;

import org.junit.Test;

import java.util.Stack;

/**
 * Created by wanyu on 2018/4/9.
 * 双栈完成队列
 */
public class StackQueue {
    private Stack<String> pushStack=new Stack<String>();
    private Stack<String> popStack=new Stack<String>();
    @Test
    public void test(){
        add("A");
        add("B");
        pop();
        pop();
        add("C");
        add("D");
        pop();
        add("E");
        push();//入队
        pop();//出队
    }
    public void add(String data){
        pushStack.push(data);
    }
    public void push(){
        while(!pushStack.isEmpty()){
            popStack.push(pushStack.pop());//倒入另一个栈
        }
    }
    public void pop(){
        while(!popStack.isEmpty()){
            System.out.println(popStack.pop());
        }
    }
}
