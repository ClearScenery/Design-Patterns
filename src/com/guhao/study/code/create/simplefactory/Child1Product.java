package com.guhao.study.code.create.simplefactory;

/**
 * @Author guhao
 * @DateTime 2019-09-12 11:20
 * @Description 简单工厂：子产品类
 **/
public class Child1Product  extends Product{
    @Override
    void info() {
        System.out.println("child 1 info...");
    }
}

