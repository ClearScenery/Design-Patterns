package com.guhao.study.code.behavioral.mediator;

/**
 * @Author guhao
 * @DateTime 2019-09-24 18:23
 * @Description
 **/
public class MediatorTest {
    public static void main(String[] args) {
        Mediator md=new ChildMediator();
        Colleague c1,c2;
        c1=new ChildColleague();
        c2=new ChildColleagueB();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
