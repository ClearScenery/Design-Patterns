package com.guhao.study.code.create.factorymethod;

/**
 * @Author guhao
 * @DateTime 2019-09-12 10:50
 * @Description 工厂方法模式：子产品类1
 **/
public class Child1Product implements Product{
    @Override
    public void info() {
        System.out.println("child1 info...");
    }
}
