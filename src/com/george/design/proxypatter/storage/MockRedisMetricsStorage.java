package com.george.design.proxypatter.storage;

import com.george.design.proxypatter.domain.RequestInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockRedisMetricsStorage implements MetricsStorage {
    private Map<String, List<RequestInfo>> map = new HashMap<>();

    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {
        if (map.containsKey(requestInfo.getApiName())) {
            map.get(requestInfo.getApiName()).add(requestInfo);
        } else {
            map.put(requestInfo.getApiName(), new ArrayList<>());
            map.get(requestInfo.getApiName()).add(requestInfo);
        }
    }

    @Override
    public List<RequestInfo> getReqestInfos(String apiName, long startTimeInMillis, long endTimeMillis) {


        return map.get(apiName);
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis) {
        return map;
    }
}
