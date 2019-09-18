package com.guhao.study.code.structural.proxy.static_proxy;

/**
 * @Author guhao
 * @DateTime 2019-09-16 10:40
 * @Description  代理的特点在于【隔离】，隔离调用者和被调用者，通过中间代理去做
 **/
public class StaticProxyTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.sayHello();
    }
}
