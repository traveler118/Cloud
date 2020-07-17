package com.ljl.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author ljl
 * @version 1.0
 * @date 2020-06-04 18:29
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
