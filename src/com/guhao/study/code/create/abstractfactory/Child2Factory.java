package com.guhao.study.code.create.abstractfactory;

/**
 * @Author guhao
 * @DateTime 2019-09-12 13:48
 * @Description 抽象工厂模式：具体工厂2
 **/
public class Child2Factory implements AbstractFactory{
    @Override
    public Product1 produce1() {
        return new Child2Product1();
    }

    @Override
    public Product2 produce2() {
        return new Child2Product2();
    }
}
