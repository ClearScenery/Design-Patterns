package com.guhao.study.code.behavioral.state;

/**
 * @Author guhao
 * @DateTime 2019-09-20 10:14
 * @Description
 **/
public class SateModeTest {
    public static void main(String[] args) {
        Context context=new Context();    //创建环境
        context.handle();    //处理请求
        context.handle();
        context.handle();
        context.handle();
    }
}
