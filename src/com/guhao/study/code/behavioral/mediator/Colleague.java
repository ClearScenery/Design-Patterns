package com.guhao.study.code.behavioral.mediator;

/**
 * @Author guhao
 * @DateTime 2019-09-24 18:12
 * @Description 中介者模式：抽象同事类
 **/
public abstract class Colleague {
    protected Mediator mediator;
    public void setMedium(Mediator mediator){
        this.mediator = mediator;
    }
    public abstract void receive();
    public abstract void send();
}
