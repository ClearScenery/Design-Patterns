package com.guhao.study.code.behavioral.observer;

/**
 * @Author guhao
 * @DateTime 2019-09-20 10:41
 * @Description
 **/
public class ChildSubjectA extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变");

        for (Observer observer:observers){
            observer.response();
        }
    }
}
