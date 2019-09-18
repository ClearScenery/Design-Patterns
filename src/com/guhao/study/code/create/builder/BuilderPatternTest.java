package com.guhao.study.code.create.builder;

/**
 * @Author guhao
 * @DateTime 2019-09-12 14:41
 * @Description 建造者模式测试
 **/
public class BuilderPatternTest {
    public static void main(String[] args) {
        Builder builder = new Child1Builder();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product);

        Builder builder2 = new Child2Builder();
        Director director2 = new Director(builder2);
        Product product2 = director2.construct();
        System.out.println(product2);
    }
}
