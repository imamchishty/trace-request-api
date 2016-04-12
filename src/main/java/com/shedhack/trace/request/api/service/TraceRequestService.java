package com.shedhack.trace.request.api.service;

import com.shedhack.trace.request.api.model.RequestModel;

import java.util.List;

/**
 * @author imamchishty
 */
public interface TraceRequestService<T extends RequestModel> {

    void persist(RequestModel mode);

    T findByRequestId(String requestId);

    List<T> findByApplicationId(String applicationId);

    List<T> findByGroupId(String groupId);

    List<T> findByCallerId(String callerId);

    List<T> findByPath(String path);

    List<T> findBySessionId(String sessionId);

    List<T> findByHttpMethod(String httpMethod);

    List<T> findByClientAddress(String clientAddress);

    List<T> findByHostAddress(String hostAddress);

    List<T> findByHeaders(String headers);

    List<T> findByExceptionId(String exceptionId);

    List<T> findByStatus(String status);

}
