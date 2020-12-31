package com.george.design.chain_responsibility.version_2;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {
    private List<IHandler> handlers = new ArrayList<>();
    public void addHandler(IHandler iHandler){
        this.handlers.add(iHandler);
    }
    public void handler(){
        for (IHandler iHandler:handlers){
            if(iHandler.handle()){
                break;
            }
        }
    }
}
