package com.george.design.chain_responsibility.example;

public interface SensitiveWordFilter {
    boolean doFilter(String content);
}
