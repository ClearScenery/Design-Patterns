package com.guhao.study.code.create.simplefactory;

/**
 * @Author guhao
 * @DateTime 2019-09-12 11:10
 * @Description 简单工厂模式：简单工厂，不符合开闭原则
 **/
public class SimpleFactory {
    Product produce(String productName){
        switch (productName){
            case "child1": return new Child1Product();
            case "child2": return new Child2Product();
            default: throw new RuntimeException("没有此产品");
        }
    }
}
