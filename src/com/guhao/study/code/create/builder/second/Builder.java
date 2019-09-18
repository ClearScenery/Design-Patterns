package com.guhao.study.code.create.builder.second;

/**
 * @Author guhao
 * @DateTime 2019-09-16 8:49
 * @Description 建造者模式：默认实现，无指挥者
 **/
public abstract class Builder {
    abstract Builder buildeA();
    abstract Builder buildeB();
    abstract Builder buildeC();
    abstract Product builde();
}
