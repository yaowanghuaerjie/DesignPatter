package com.george.design.chain_responsibility.example;

import java.util.ArrayList;
import java.util.List;

public class SensitiveWordFilterChain {
    private List<SensitiveWordFilter> filters = new ArrayList<>();

    public void addFilter(SensitiveWordFilter sensitiveWordFilter) {
        filters.add(sensitiveWordFilter);
    }

    public boolean filter(String content) {
        for (SensitiveWordFilter sensitiveWordFilter : filters) {
            if (!sensitiveWordFilter.doFilter(content)) {
                return false;
            }
        }
        return true;
    }



}
