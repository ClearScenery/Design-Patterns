package com.guhao.study.code.behavioral.observer;

/**
 * @Author guhao
 * @DateTime 2019-09-20 10:44
 * @Description
 **/
public class ObserverModeTest {
    public static void main(String[] args) {
        Subject subject = new ChildSubjectA();
        Observer observer1 = new ChildObserverA();
        Observer observer2 = new ChildObserverB();
        subject.add(observer1);
        subject.add(observer2);
        subject.notifyObserver();
    }
}
