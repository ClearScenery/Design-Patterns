package com.guhao.study.code.structural.proxy.static_proxy;

/**
 * @Author guhao
 * @DateTime 2019-09-16 10:35
 * @Description  静态代理：控制对目标类的访问，自己构造对象，非外界传入
 **/
public class Proxy implements Subject {

    private ChildSubject childSubject = new ChildSubject();

    @Override
    public void sayHello() {
        preSayHello();
        this.childSubject.sayHello();
        postSayHello();
    }


    public void preSayHello(){
        System.out.println("do something before sayHello");
    }

    public void postSayHello(){
        System.out.println("do something after sayHello");
    }
}
