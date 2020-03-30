package com.guhao.study.code.behavioral.command;

/**
 * @Author guhao
 * @DateTime 2019-09-20 8:50
 * @Description
 **/
public class ChildCommand implements Command{

    private Receiver receiver;

    public ChildCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
