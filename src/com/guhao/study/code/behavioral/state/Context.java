package com.guhao.study.code.behavioral.state;

/**
 * @Author guhao
 * @DateTime 2019-09-20 10:09
 * @Description
 **/
public class Context {
    private State state;

    public Context(){
        //初始状态
        state = new ChildStateA();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle(){
        //随着环境中不停掉好用handle方法，state状态不断发生改变
        state.handle(this);
    }
}
