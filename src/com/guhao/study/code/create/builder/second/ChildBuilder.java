package com.guhao.study.code.create.builder.second;

/**
 * @Author guhao
 * @DateTime 2019-09-16 8:54
 * @Description 建造者模式：建造者实现
 **/
public class ChildBuilder extends Builder{

    private Product product = new Product();

    @Override
    Builder buildeA() {
        product.setPartA("A");
        return this;
    }

    @Override
    Builder buildeB() {
        product.setPartB("B");
        return this;
    }

    @Override
    Builder buildeC() {
        product.setPartC("C");
        return this;
    }

    @Override
    Product builde() {
        return product;
    }
}
