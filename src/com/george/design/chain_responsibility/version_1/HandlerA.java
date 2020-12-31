package com.george.design.chain_responsibility.version_1;

public class HandlerA extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        //....
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
