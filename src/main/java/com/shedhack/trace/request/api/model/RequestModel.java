package com.shedhack.trace.request.api.model;

import java.util.Date;

/**
 * <pre>
 *  Interface for the RequestModel containing the following properties:
 *
 *  applicationId, requestId, groupId, callerId, path, sessionId, httpMethod,
 *  clientAddress, hostAddress, dateTime, http headers.
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

    Date getDateTime();

    /**
     * Returns the full HTTP headers as a single JSON string.
     */
    String getHeaders();
}
