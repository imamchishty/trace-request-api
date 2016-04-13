package com.shedhack.trace.request.api.service;

import com.shedhack.trace.request.api.model.RequestModel;

import java.util.List;

/**
 * @author imamchishty
 */
public interface TraceRequestService {

    RequestModel persist(RequestModel model);

    RequestModel findByRequestId(String requestId);

    List<? extends RequestModel> findByApplicationId(String applicationId);

    List<? extends RequestModel> findByGroupId(String groupId);

    List<? extends RequestModel> findByCallerId(String callerId);

    List<? extends RequestModel> findByPath(String path);

    List<? extends RequestModel> findBySessionId(String sessionId);

    List<? extends RequestModel> findByHttpMethod(String httpMethod);

    List<? extends RequestModel> findByClientAddress(String clientAddress);

    List<? extends RequestModel> findByHostAddress(String hostAddress);

    List<? extends RequestModel> findByHeaders(String headers);

    List<? extends RequestModel> findByExceptionId(String exceptionId);

    List<? extends RequestModel> findByStatus(String status);

}
