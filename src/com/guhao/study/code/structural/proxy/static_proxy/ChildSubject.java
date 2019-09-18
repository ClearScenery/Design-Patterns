package com.guhao.study.code.structural.proxy.static_proxy;

/**
 * @Author guhao
 * @DateTime 2019-09-16 10:35
 * @Description
 **/
public class ChildSubject implements Subject{
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
