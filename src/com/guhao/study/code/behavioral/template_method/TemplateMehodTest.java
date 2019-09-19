package com.guhao.study.code.behavioral.template_method;

/**
 * @Author guhao
 * @DateTime 2019-09-19 11:04
 * @Description 模板方法模式测试
 **/
public class TemplateMehodTest {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ChildClass();
        abstractClass.templateMethod();
    }
}
