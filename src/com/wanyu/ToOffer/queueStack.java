package com.wanyu.ToOffer;

import org.junit.Test;

import java.util.Stack;

/**
 * Created by wanyu on 2018/7/12.
 * 双栈实现一个队列
 */
public class queueStack {

    public Stack<Integer> stack1 = new Stack<Integer>();
    public Stack<Integer> stack2 = new Stack<Integer>();
   @Test
    public void test(){
        push(1);
       push(2);
       push(3);
       System.out.println(pop());
       System.out.println(pop());
       push(4);
       System.out.println(pop());
       push(5);
       System.out.println(pop());
    }
    public void push(int val){
        stack1.push(val);
    }
    public int pop(){
        if(stack2.isEmpty()){//为空时再进元素
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
