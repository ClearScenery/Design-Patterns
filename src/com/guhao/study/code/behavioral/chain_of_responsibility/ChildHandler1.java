package com.guhao.study.code.behavioral.chain_of_responsibility;

/**
 * @Author guhao
 * @DateTime 2019-09-20 9:50
 * @Description
 **/
public class ChildHandler1 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.endsWith("one")){
            System.out.println("子处理器1负责该请求");
        }else{
            if(getNext()!=null){
                getNext().handleRequest(request);
            }else{
                System.out.println("nobody handle this request");
            }
        }
    }
}
