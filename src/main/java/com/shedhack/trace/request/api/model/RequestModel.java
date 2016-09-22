package com.shedhack.trace.request.api.model;

import com.shedhack.trace.request.api.constant.Status;

import java.util.Date;

/**
 * <pre>
 *  Interface for the RequestModel containing the following properties:
 *
 *  applicationId, spanId, traceId, callerId, path, sessionId, httpMethod,
 *  clientAddress, hostAddress, requestDateTime, http headers, status
 *  responseDateTime, exceptionId.
 *
 * </pre>
 *
 * @author imamchishty
 */
public interface RequestModel {
    
    String getApplicationId();

    void setApplicationId(String applicationId) ;

    String getSpanId();

    void setSpanId(String requestId);

    String getTraceId();

    void setTraceId(String traceId);

    String getCallerId();

    void setCallerId(String callerId);

    String getPath();

    void setPath(String path);

    String getSessionId();

    void setSessionId(String sessionId);

    String getHttpMethod();

    void setHttpMethod(String httpMethod);

    String getClientAddress();

    void setClientAddress(String clientAddress);

    String getHostAddress();

    void setHostAddress(String hostAddress);

    long getRequestDateTime();

    void setRequestDateTime(long requestDateTime);

    String getHeaders();

    void setHeaders(String headers);

    long getResponseDateTime();

    void setResponseDateTime(long responseDateTime);

    String getExceptionId();

    void setExceptionId(String exceptionId);

    Status getStatus();

    void setStatus(Status status);

    int getHttpStatusCode();

    void setHttpStatusCode(int code);

}
