package com.george.design.chain_responsibility.version_3;

/**
 * 责任链模式的变种：请求被每个处理器处理，不存在终止的情况
 */
public abstract class Handler{
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    public final void handle(){
        doHandler();
        if(null!=successor){
            successor.handle();
        }
    }

    protected abstract void doHandler();
}