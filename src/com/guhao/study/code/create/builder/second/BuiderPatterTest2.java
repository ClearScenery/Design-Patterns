package com.guhao.study.code.create.builder.second;

/**
 * @Author guhao
 * @DateTime 2019-09-16 9:00
 * @Description
 **/
public class BuiderPatterTest2 {
    public static void main(String[] args) {
        Builder builder = new ChildBuilder();
        Product product =  builder.buildeA()
                                    .buildeB()
                                    .buildeC()
                                    .builde();
        System.out.println(product);
    }
}
