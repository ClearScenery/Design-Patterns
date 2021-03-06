package com.guhao.study.code.create.builder;

/**
 * @Author guhao
 * @DateTime 2019-09-12 14:28
 * @Description 建造者模式：抽象建造者
 *
 * 建造者（Builder）模式创建的是复杂对象，其产品的各个部分经常面临着剧烈的变化，但将它们组合在一起的算法却相对稳定，所以它通常在以下场合使用。
 * 创建的对象较复杂，由多个部件构成，各部件面临着复杂的变化，但构件间的建造顺序是稳定的。
 * 创建复杂对象的算法独立于该对象的组成部分以及它们的装配方式，即产品的构建过程和最终的表示是独立的。
 *
 * 建造者（Builder）模式在应用过程中可以根据需要改变，如果创建的产品种类只有一种，
 * 只需要一个具体建造者，这时可以省略掉抽象建造者，甚至可以省略掉指挥者角色。
 **/
public abstract class Builder {
    protected Product product = new Product();

    public abstract void buiderPartA();

    public abstract void buiderPartB();

    public abstract void buiderPartC();

    public Product getResult(){
        return product;
    }
}
