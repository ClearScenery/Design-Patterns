package com.guhao.study.code.create.singleton;

import java.util.concurrent.*;

/**
 * @Author guhao
 * @DateTime 2019-09-10 16:24
 * @Description 单例：线程安全的懒汉，直接加synchronized，锁占用资源
 **/
public class Singleton6 {
    private static Singleton6 singleton6;

    private Singleton6(){}

    public static synchronized Singleton6 getInstance(){
        if(singleton6 == null){
            singleton6 = new Singleton6();
        }
        return singleton6;
    }
}

class Singleton6Test implements Runnable{
    int num = Runtime.getRuntime().availableProcessors();
    ExecutorService executor = Executors.newFixedThreadPool(num);
    CyclicBarrier cb=new CyclicBarrier(num,this);

    public static void main(String[] args) {
        Singleton6Test test = new Singleton6Test();
        while(test.num-- > 0){
            test.executor.execute(()->{
                System.out.println(Thread.currentThread().getName()+"-----"+Singleton6.getInstance());
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
