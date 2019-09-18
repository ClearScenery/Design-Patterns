package com.guhao.study.code.create.singleton;

import java.util.concurrent.*;

/**
 * @Author guhao
 * @DateTime 2019-09-10 15:14
 * @Description 单例：饿汉模式，类初始化就实例化，天生线程安全，常驻内存，不能懒加载
 **/
public class Singleton3 {
    private static final Singleton3 singleton3 = new Singleton3();

    private Singleton3(){}

    public static Singleton3 getInstance(){
        return singleton3;
    }
}

class Singleton3Test implements Runnable{
    int num = Runtime.getRuntime().availableProcessors();
    ExecutorService executor = Executors.newFixedThreadPool(num);
    CyclicBarrier cb=new CyclicBarrier(num,this);

    public static void main(String[] args) {
        Singleton3Test test = new Singleton3Test();
        while(test.num-- > 0){
            test.executor.execute(()->{
                System.out.println(Thread.currentThread().getName()+"-----"+Singleton3.getInstance());
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