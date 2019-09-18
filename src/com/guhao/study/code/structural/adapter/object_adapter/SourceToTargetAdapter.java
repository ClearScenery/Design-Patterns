package com.guhao.study.code.structural.adapter.object_adapter;

/**
 * @Author guhao
 * @DateTime 2019-09-17 10:02
 * @Description 适配器模式：适配类
 **/
public class SourceToTargetAdapter implements Target {

    private Source source;

    public SourceToTargetAdapter(Source source){
        this.source = source;
    }

    @Override
    public void targetMethod() {
        source.sourceMethod();
    }
}
