package com.guhao.study.code.behavioral.template_method;

/**
 * @Author guhao
 * @DateTime 2019-09-19 10:46
 * @Description 模板方法模式：抽象类
 **/
public abstract  class AbstractClass {

    public AbstractClass(){}

    public void templateMethod(){
        specificMethod();
        if(hookMethod()){
            abstractMethod1();
        }
        abstractMethod2();
    }

    public abstract void abstractMethod1();
    public abstract void abstractMethod2();

    public boolean hookMethod() {
        //钩子方法，子类重写可控制父类逻辑
        //逻辑
        return true;
    }

    public void specificMethod() {
        System.out.println("具体方法");
    }
}
