package com.guhao.study.code.create.singleton;

import java.util.concurrent.*;

/**
 * @Author guhao
 * @DateTime 2019-09-10 15:11
 * @Description 单例：懒汉模式，多线程下不安全，可以懒加载
 **/
public class Singleton1 {

    private static Singleton1 singleton1;

    private Singleton1(){}

    public static Singleton1 getInstance(){
        if(singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}

class Singleton1Test implements Runnable{
    int num = Runtime.getRuntime().availableProcessors();
    ExecutorService executor = Executors.newFixedThreadPool(num);
    CyclicBarrier cb=new CyclicBarrier(num,this);

    public static void main(String[] args) {
        Singleton1Test test = new Singleton1Test();
        while(test.num-- > 0){
            test.executor.execute(()->{
                System.out.println(Thread.currentThread().getName()+"-----"+Singleton1.getInstance());
                try {
                    test.cb.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
        }
        test.executor.shutdown();
    }

    @Override
    public void run() {

    }
}