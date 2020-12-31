package com.george.design.chain_responsibility.version_1;

public class HandlerB extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        //TODO
        if(!handled&& successor!=null){
            successor.handle();
        }
    }
}
