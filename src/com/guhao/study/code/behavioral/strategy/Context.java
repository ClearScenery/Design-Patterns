package com.guhao.study.code.behavioral.strategy;

/**
 * @Author guhao
 * @DateTime 2019-09-19 10:35
 * @Description 策略模式：环境类
 **/
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod(){
        strategy.strategyMethod();
    }
}
