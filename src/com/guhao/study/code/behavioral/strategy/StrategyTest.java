package com.guhao.study.code.behavioral.strategy;

/**
 * @Author guhao
 * @DateTime 2019-09-19 10:44
 * @Description 测试
 **/
public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ChildStrategyB());
        context.strategyMethod();
    }
}
