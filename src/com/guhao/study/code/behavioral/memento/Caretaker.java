package com.guhao.study.code.behavioral.memento;

/**
 * @Author guhao
 * @DateTime 2019-10-21 8:18
 * @Description
 **/
public class Caretaker {
    private Memento memento;

    public void setMemento(Memento m){
        this.memento = m;
    }

    public Memento getMemento(){
        return memento;
    }
}
