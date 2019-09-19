package com.guhao.study.code.behavioral.strategy;

/**
 * @Author guhao
 * @DateTime 2019-09-19 10:24
 * @Description 策略模式：具体策略B
 **/
public class ChildStrategyB implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("使用策略B");
    }
}
