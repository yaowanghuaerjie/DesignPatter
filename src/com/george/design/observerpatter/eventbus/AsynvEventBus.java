package com.george.design.observerpatter.eventbus;

import java.util.concurrent.Executor;

public class AsynvEventBus extends EventBus{
    public AsynvEventBus(Executor executor) {
        super(executor);
    }
}
