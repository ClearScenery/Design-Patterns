package com.guhao.study.code.create.factorymethod;

/**
 * @Author guhao
 * @DateTime 2019-09-12 10:34
 * @Description 工厂方法模式：抽象工厂,当需要生成的产品不多且不会增加，一个具体工厂类就可以完成任务时，可删除抽象工厂类。
 *              这时工厂方法模式将退化到简单工厂模式
 **/
public interface AbstractFactory {
    Product produce();
}
