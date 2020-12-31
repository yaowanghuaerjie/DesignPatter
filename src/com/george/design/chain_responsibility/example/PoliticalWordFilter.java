package com.george.design.chain_responsibility.example;

public class PoliticalWordFilter implements SensitiveWordFilter{

    @Override
    public boolean doFilter(String content) {
        System.out.println("审查内容中是否包含政治内容");
        return true;
    }
}
