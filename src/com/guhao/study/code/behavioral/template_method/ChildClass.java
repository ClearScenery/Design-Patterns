package com.guhao.study.code.behavioral.template_method;

/**
 * @Author guhao
 * @DateTime 2019-09-19 11:01
 * @Description 模板方法模式：具体子类
 **/
public class ChildClass extends AbstractClass{

    @Override
    public boolean hookMethod() {
        return false;
    }

    @Override
    public void abstractMethod1() {
        System.out.println("子类决定的方法逻辑1");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("子类决定的方法逻辑2");
    }
}
