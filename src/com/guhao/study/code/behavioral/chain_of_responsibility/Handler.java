package com.guhao.study.code.behavioral.chain_of_responsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author guhao
 * @DateTime 2019-09-20 9:39
 * @Description
 **/
public abstract class Handler {
   private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);
}
