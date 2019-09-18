package com.guhao.study.code.create.factorymethod;

/**
 * @Author guhao
 * @DateTime 2019-09-12 10:52
 * @Description 工厂方法模式：子产品1的工厂
 **/
public class Child1Factory implements AbstractFactory{
    @Override
    public Product produce() {
        return new Child1Product();
    }
}
