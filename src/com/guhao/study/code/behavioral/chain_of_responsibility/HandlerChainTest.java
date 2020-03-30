package com.guhao.study.code.behavioral.chain_of_responsibility;

/**
 * @Author guhao
 * @DateTime 2019-09-20 9:56
 * @Description
 **/
public class HandlerChainTest {
    public static void main(String[] args) {
        //组装责任链
        Handler childHandler1 = new ChildHandler1();
        childHandler1.setNext(new ChildHandler2());

        //提交请求
        childHandler1.handleRequest("one");
        childHandler1.handleRequest("two");
        childHandler1.handleRequest("three");
    }
}
