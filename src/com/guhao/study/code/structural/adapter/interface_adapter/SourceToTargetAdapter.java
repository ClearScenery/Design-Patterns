package com.guhao.study.code.structural.adapter.interface_adapter;

/**
 * @Author guhao
 * @DateTime 2019-09-17 10:22
 * @Description
 **/
public class SourceToTargetAdapter implements Target{

    private Source source;

    public SourceToTargetAdapter(Source source){
        this.source = source;
    }

    @Override
    public void targetMethod() {
        source.sourceMethod();
    }
}
