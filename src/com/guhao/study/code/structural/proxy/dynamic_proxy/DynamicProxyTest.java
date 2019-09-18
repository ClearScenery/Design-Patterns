package com.guhao.study.code.structural.proxy.dynamic_proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author guhao
 * @DateTime 2019-09-16 10:43
 * @Description 动态代理，利用JDK自带的动态代理实现
 **/
public class DynamicProxyTest {

    public static void main(String[] args) {
        Object proxy = Proxy.newProxyInstance(Subject.class.getClassLoader(), Subject.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("sayhello...before");
                Object obj = method.invoke(new ChildSubject(), args);
                System.out.println("sayhello...after");
                return obj;
            }
        });
    }

}
