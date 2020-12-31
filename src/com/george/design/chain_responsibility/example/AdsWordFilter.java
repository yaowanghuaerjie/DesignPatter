package com.george.design.chain_responsibility.example;

public class AdsWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(String content) {
        System.out.println("审查内容中是否包含广告");
        return true;
    }
}
