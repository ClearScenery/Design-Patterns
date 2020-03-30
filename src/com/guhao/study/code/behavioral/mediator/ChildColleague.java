package com.guhao.study.code.behavioral.mediator;

/**
 * @Author guhao
 * @DateTime 2019-09-24 18:17
 * @Description
 **/
public class ChildColleague extends Colleague{

    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求");
        mediator.relay(this);//中介者转发
    }

}
