package com.guhao.study.code.behavioral.observer;

/**
 * @Author guhao
 * @DateTime 2019-09-20 10:43
 * @Description
 **/
public class ChildObserverB implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者B做出反应");
    }
}
