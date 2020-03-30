package com.guhao.study.code.behavioral.chain_of_responsibility;

/**
 * @Author guhao
 * @DateTime 2019-09-20 9:50
 * @Description
 **/
public class ChildHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.endsWith("two")){
            System.out.println("子处理器2负责该请求");
        }else{
            if(getNext()!=null){
                getNext().handleRequest(request);
            }else{
                System.out.println("nobody handle this request");
            }
        }
    }
}
