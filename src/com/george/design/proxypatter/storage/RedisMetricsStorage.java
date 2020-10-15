package com.george.design.proxypatter.storage;

import com.george.design.proxypatter.domain.RequestInfo;

import java.util.List;
import java.util.Map;

public class RedisMetricsStorage implements MetricsStorage{
    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {

    }

    @Override
    public List<RequestInfo> getReqestInfos(String apiName, long startTimeInMillis, long endTimeMillis) {
        return null;
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis) {
        return null;
    }
}
