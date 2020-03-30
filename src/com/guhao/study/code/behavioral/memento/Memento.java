package com.guhao.study.code.behavioral.memento;

/**
 * @Author guhao
 * @DateTime 2019-10-21 8:13
 * @Description 备忘录模式
 **/
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }
}
