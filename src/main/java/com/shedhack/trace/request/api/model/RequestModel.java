package com.shedhack.trace.request.api.model;

import com.shedhack.trace.request.api.constant.Status;

import java.util.Date;

/**
 * <pre>
 *  Interface for the RequestModel containing the following properties:
 *
 *  clientAddress, hostAddress, requestDateTime, http headers, status
 *  responseDateTime, exceptionId.
 *
 * </pre>
 *
 * @author imamchishty
 */
public interface RequestModel {

    String getApplicationId();

    String getRequestId();

    String getGroupId();

    String getCallerId();

    String getPath();

    String getSessionId();

    String getHttpMethod();

    String getClientAddress();

    String getHostAddress();

    Date getRequestDateTime();

    /**
     * Returns the full HTTP headers as a single JSON string.
     */
    String getHeaders();

    Date getResponseDateTime();

    Status getStatus();

    String getExceptionId();
}
