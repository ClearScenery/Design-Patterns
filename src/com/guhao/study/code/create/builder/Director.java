package com.guhao.study.code.create.builder;

/**
 * @Author guhao
 * @DateTime 2019-09-12 14:28
 * @Description 建造者模式：指挥者
 **/
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Product construct(){
        builder.buiderPartA();
        builder.buiderPartB();
        builder.buiderPartC();
        return builder.getResult();
    }
}
