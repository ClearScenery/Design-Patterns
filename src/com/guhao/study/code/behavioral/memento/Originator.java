package com.guhao.study.code.behavioral.memento;

/**
 * @Author guhao
 * @DateTime 2019-10-21 8:16
 * @Description 发起人
 **/
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(Memento m){
        this.setState(m.getState());
    }
}
