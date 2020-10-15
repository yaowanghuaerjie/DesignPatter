package com.george.design.proxypatter.storage;

import com.george.design.proxypatter.domain.RequestInfo;

import java.util.List;
import java.util.Map;

public interface MetricsStorage {
    void saveRequestInfo(RequestInfo requestInfo);

    List<RequestInfo> getReqestInfos(String apiName, long startTimeInMillis, long endTimeMillis);

    Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis);
}
