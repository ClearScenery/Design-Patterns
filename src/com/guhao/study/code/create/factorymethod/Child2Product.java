package com.guhao.study.code.create.factorymethod;

/**
 * @Author guhao
 * @DateTime 2019-09-12 10:51
 * @Description 工厂方法模式：子产品2类
 **/
public class Child2Product implements Product{
    @Override
    public void info() {
        System.out.println("child2 info...");
    }
}
