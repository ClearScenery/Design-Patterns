package com.guhao.study.code.behavioral.iterator;

import java.util.List;

/**
 * @Author guhao
 * @DateTime 2019-10-08 9:09
 * @Description
 **/
public class ConcreteIterator implements Iterator{

    private List<Object> list = null;
    private int index = -1;

    public ConcreteIterator(List<Object> list){
        this.list = list;
    }


    @Override
    public Object first() {
        index = 0;
        return list.get(0);
    }

    @Override
    public Object next() {
        if(!this.hasNext())
        return null;

        return list.get(++index);
    }

    @Override
    public boolean hasNext() {
        if(index < list.size() - 1){
            return true;
        }else{
            return false;
        }
    }
}
