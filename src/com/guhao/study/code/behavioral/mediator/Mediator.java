package com.guhao.study.code.behavioral.mediator;

/**
 * @Author guhao
 * @DateTime 2019-09-24 18:06
 * @Description 中介者模式：抽象中介者
 **/
public abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague colleague);
}
