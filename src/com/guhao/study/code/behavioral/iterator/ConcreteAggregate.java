package com.guhao.study.code.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author guhao
 * @DateTime 2019-10-08 9:04
 * @Description
 **/
public class ConcreteAggregate implements Aggregate{

    private List<Object> list = new ArrayList<Object>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator iterator(Object obj) {
        return new ConcreteIterator(list);
    }
}
