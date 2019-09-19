package com.guhao.study.code.structural.bridge;

/**
 * @Author guhao
 * @DateTime 2019-09-19 12:39
 * @Description
 **/
public class ChildAbstraction extends  Abstraction{

    protected ChildAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        //扩展逻辑
        implementor.operationImpl();
    }
}
