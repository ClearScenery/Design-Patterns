package com.guhao.study.code.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author guhao
 * @DateTime 2019-09-24 18:21
 * @Description
 **/
public class ChildMediator extends Mediator {

    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if(!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for(Colleague ob:colleagues){
            if(!ob.equals(colleague)){
                ob.receive();
            }
        }
    }
}
