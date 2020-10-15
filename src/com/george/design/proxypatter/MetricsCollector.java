package com.george.design.proxypatter;

import com.george.design.proxypatter.domain.RequestInfo;
import com.george.design.proxypatter.storage.MetricsStorage;
import com.george.design.utils.StringUtils;

public class MetricsCollector {
    private MetricsStorage metricsStorage;

    public MetricsCollector(MetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
    }

    public void recordRequest(RequestInfo requestInfo) {
        if (requestInfo == null || StringUtils.isBlank(requestInfo.getApiName())) {
            return;
        }
        metricsStorage.saveRequestInfo(requestInfo);
    }
}
