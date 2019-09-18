package com.guhao.study.code.create.singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @Author guhao
 * @DateTime 2019-09-10 16:08
 * @Description 单例：枚举天生单例，effective java 作者提倡的一种单例方式
 **/
public enum Singleton5 {
    INSTANCE
}
class Singleton5Test{
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(5);
    }
}