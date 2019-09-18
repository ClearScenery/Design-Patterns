package com.guhao.study.code.create.singleton;

import java.util.concurrent.*;

/**
 * @Author guhao
 * @DateTime 2019-09-10 15:14
 * @Description 单例：双重锁检测，线程安全，性能不太好
 **/
public class Singleton2 {

    private static Singleton2 singleton2;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if(singleton2 == null){
            synchronized(Singleton2.class){
                if(singleton2 == null){
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}

class Singleton2Test implements Runnable{
    int num = Runtime.getRuntime().availableProcessors();
    ExecutorService executor = Executors.newFixedThreadPool(num);
    CyclicBarrier cb=new CyclicBarrier(num,this);

    public static void main(String[] args) {
        Singleton2Test test = new Singleton2Test();
        while(test.num-- > 0){
            test.executor.execute(()->{
                System.out.println(Thread.currentThread().getName()+"-----"+Singleton2.getInstance());
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