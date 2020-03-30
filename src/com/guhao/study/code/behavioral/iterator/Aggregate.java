package com.guhao.study.code.behavioral.iterator;

/**
 * @Author guhao
 * @DateTime 2019-10-08 8:50
 * @Description 迭代器模式
 **/
public interface Aggregate {
    void add(Object obj);
    void remove(Object obj);
    Iterator iterator(Object obj);
}
