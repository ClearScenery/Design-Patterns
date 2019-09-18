package com.guhao.study.code.create.singleton;

import java.util.concurrent.*;

/**
 * @Author guhao
 * @DateTime 2019-09-10 16:02
 * @Description 单例：静态内部类，懒加载实例化，第一次实例化有延迟，之后没有
 **/
public class Singleton4 {

    private static class Inner{
        private static final Singleton4 singleton4 = new Singleton4();
    }

    private Singleton4(){}

    public static Singleton4 getInstance(){
        return Inner.singleton4;
    }
}

class Singleton4Test implements Runnable{
    int num = Runtime.getRuntime().availableProcessors();
    ExecutorService executor = Executors.newFixedThreadPool(num);
    CyclicBarrier cb=new CyclicBarrier(num,this);

    public static void main(String[] args) {
        Singleton4Test test = new Singleton4Test();
        while(test.num-- > 0){
            test.executor.execute(()->{
                System.out.println(Thread.currentThread().getName()+"-----"+Singleton4.getInstance());
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