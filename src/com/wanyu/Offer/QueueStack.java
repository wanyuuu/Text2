package com.wanyu.Offer;

import org.junit.Test;

import java.util.LinkedList;

/**
 * Created by wanyu on 2018/4/9.
 * 两个队列实现栈
 */
public class QueueStack {
    private LinkedList<String> list1 = new LinkedList<>();
    private LinkedList<String> list2 = new LinkedList<>();

    @Test
    public void test() {
        this.push("A");
        this.push("B");
        this.push("C");
        this.push("D");
        System.out.println(this.pop());
        System.out.println(this.pop());
        this.push("e");
        this.push("f");
        System.out.println(this.pop());
        System.out.println(this.pop());
        System.out.println(this.pop());
        System.out.println(this.pop());
        System.out.println(this.pop());
    }

    public void push(String data) {
        list1.add(data);
    }

    public String pop() {
        if (list1.size() == 0 && list2.size() == 0) {
            return null;
        }
        if (list2.size() == 0) {
            while (list1.size() > 0) {   // list1 A B C D
                list2.add(list1.removeLast());// D C B A
            }
        }else{ // B A
            while(list1.size()>0){ // e f
                list2.addFirst(list1.removeFirst());// f e B A
            }
        }
        return list2.removeFirst();
    }
}
