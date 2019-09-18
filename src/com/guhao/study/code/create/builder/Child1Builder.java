package com.guhao.study.code.create.builder;

/**
 * @Author guhao
 * @DateTime 2019-09-12 14:37
 * @Description 建造者模式：具体建造者1
 **/
public class Child1Builder extends Builder{
    @Override
    public void buiderPartA() {
        product.setPartA("partA1");
    }

    @Override
    public void buiderPartB() {
        product.setPartB("partB1");
    }

    @Override
    public void buiderPartC() {
        product.setPartC("partC1");
    }
}
