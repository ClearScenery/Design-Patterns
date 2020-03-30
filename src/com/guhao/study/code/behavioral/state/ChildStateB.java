package com.guhao.study.code.behavioral.state;

/**
 * @Author guhao
 * @DateTime 2019-09-20 10:10
 * @Description
 **/
public class ChildStateB extends State{
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是B");
        context.setState(new ChildStateA());
    }
}
