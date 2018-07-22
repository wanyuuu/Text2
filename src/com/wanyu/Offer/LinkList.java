package com.wanyu.Offer;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by wanyu on 2018/4/9.
 * 链表 插入 尾到头遍历
 */
public class LinkList {
    public class Node{
        private String data;
        private Node next;
        public Node(String data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    private Node header;
    private Node tail;
    private int size=0;
    @Test
    public void test(){
        this.addTail("A");
        this.addTail("B");
        this.addTail("C");
        this.addTail("D");
        this.addTail("E");
        this.printTailToHead(header);
    }
    public void addHeader(String data){ //从头添加 E D C B A
        if(header==null){
            header=new Node(data,null);
            tail=header;
        }else {
            Node newNode=new Node(data,header);
            header=newNode;
        }
        size++;
    }
    public void addTail(String data){  //从尾部添加
        if(tail==null){
            tail=new Node(data,null);
            header=tail;
        }else {
            Node newNode=new Node(data,null);
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    public void printTailToHead(Node node){//从尾到头打印链表
        ArrayList<String> list=new ArrayList<String>();
        while(node!=null){
            list.add(node.data);
            node=node.next;
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}
