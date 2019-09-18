package com.guhao.study.code.structural.adapter.class_adapter;

/**
 * @Author guhao
 * @DateTime 2019-09-17 10:02
 * @Description 适配器模式：适配类
 **/
public class SourceToTargetAdapter extends Source implements Target{
    @Override
    public void targetMethod() {
        sourceMethod();
    }
}
