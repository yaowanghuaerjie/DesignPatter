package com.george.design.chain_responsibility;

import com.george.design.chain_responsibility.example.AdsWordFilter;
import com.george.design.chain_responsibility.example.PoliticalWordFilter;
import com.george.design.chain_responsibility.example.SensitiveWordFilterChain;
import com.george.design.chain_responsibility.example.SexyWordFilter;
import com.george.design.chain_responsibility.version_1.HandlerA;
import com.george.design.chain_responsibility.version_1.HandlerB;
import com.george.design.chain_responsibility.version_1.HandlerChain;
import com.george.design.chain_responsibility.version_2.HandlerC;
import com.george.design.chain_responsibility.version_2.HandlerD;
import com.george.design.chain_responsibility.version_3.HandleE;
import com.george.design.chain_responsibility.version_3.HandleF;

public class ApplicationDemo {
    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new HandlerA());
        handlerChain.addHandler(new HandlerB());
        handlerChain.handle();

        com.george.design.chain_responsibility.version_2.HandlerChain handlerChain2 = new com.george.design.chain_responsibility.version_2.HandlerChain();
        handlerChain2.addHandler(new HandlerC());
        handlerChain2.addHandler(new HandlerD());
        handlerChain2.handler();

        com.george.design.chain_responsibility.version_3.HandlerChain handlerChain3 = new com.george.design.chain_responsibility.version_3.HandlerChain();
        handlerChain3.addHandler(new HandleE());
        handlerChain3.addHandler(new HandleF());
        handlerChain3.handle();

        SensitiveWordFilterChain sensitiveWordFilterChain = new SensitiveWordFilterChain();
        sensitiveWordFilterChain.addFilter(new SexyWordFilter());
        sensitiveWordFilterChain.addFilter(new PoliticalWordFilter());
        sensitiveWordFilterChain.addFilter(new AdsWordFilter());
        boolean legal =  sensitiveWordFilterChain.filter("我要发布帖子");
        if(legal){
            System.out.println("发布成功");
        }else {
            System.out.println("您发布的帖子包含敏感信息，无法发布");
        }


    }
}
