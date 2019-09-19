package com.guhao.study.code.structural.bridge;

/**
 * @Author guhao
 * @DateTime 2019-09-19 12:36
 * @Description
 **/
public abstract class Abstraction {
    protected Implementor implementor;

    protected  Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    public abstract  void operation();
}
