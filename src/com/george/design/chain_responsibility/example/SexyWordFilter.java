package com.george.design.chain_responsibility.example;

public class SexyWordFilter implements SensitiveWordFilter{
    @Override
    public boolean doFilter(String content) {
        System.out.println("审核内容是否包含色情信息");
        return true;
    }
}
