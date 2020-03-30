package com.guhao.study.code.behavioral.mediator;

/**
 * @Author guhao
 * @DateTime 2019-09-24 18:19
 * @Description
 **/
public class ChildColleagueB extends Colleague{
    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求");
        mediator.relay(this);
    }
}
