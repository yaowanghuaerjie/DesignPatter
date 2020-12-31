package com.george.design.chain_responsibility.version_3;

public class HandlerChain {
    private Handler head;
    private Handler tail;

    public void addHandler(Handler handler) {
        handler.setSuccessor(null);
        if (null == head) {
            head = handler;
            tail = handler;
            return;
        }
        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle(){
        if(null!=head){
            head.handle();
        }
    }

}
