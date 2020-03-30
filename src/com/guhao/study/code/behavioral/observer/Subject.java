package com.guhao.study.code.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author guhao
 * @DateTime 2019-09-20 10:36
 * @Description
 **/
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyObserver();
}
