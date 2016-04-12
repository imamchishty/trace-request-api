package com.shedhack.trace.request.api.threadlocal;

import com.shedhack.trace.request.api.constant.Status;
import com.shedhack.trace.request.api.model.RequestModel;

import java.util.Date;

/**
 * <pre>
 *  Request model containing the following properties:
 *
 *  applicationId, requestId, groupId, callerId, path, sessionId, httpMethod,
 *  clientAddress, hostAddress, requestDateTime, http headers, status
 *  responseDateTime, exceptionId.
 *
 * </pre>
 *
 * @author imamchishty
 */
public class DefaultRequestModel implements RequestModel {


    // ----------------------------------
    // Static inner class for the builder
    // ----------------------------------

    public static class Builder {

        public Builder(String appId, String reqId, String groupId) {
            withApplicationId(appId).withRequestId(reqId).withGroupId(groupId);
        }

        DefaultRequestModel model = new DefaultRequestModel();

        private Builder withApplicationId(String id) {
            model.applicationId = id;
            return this;
        }

        public Builder withRequestDateTime(Date date){
            model.requestDateTime = date;
            return this;
        }

        private Builder withRequestId(String requestId) {
            model.requestId = requestId;
            return this;
        }

        private Builder withGroupId(String groupId) {
            model.groupId = groupId;
            return this;
        }

        public Builder withCallerId(String callerId) {
            model.callerId = callerId;
            return this;
        }

        public Builder withPath(String path) {
            model.path = path;
            return this;
        }

        public Builder withSessionId(String sessionId) {
            model.sessionId = sessionId;
            return this;
        }

        public Builder withHttpMethod(String method) {
            model.httpMethod = method;
            return this;
        }

        public Builder withClientAddress(String address) {
            model.clientAddress = address;
            return this;
        }

        public Builder withHostAddress(String address) {
            model.hostAddress= address;
            return this;
        }

        public Builder withHttpHeaders(String headers) {
            model.headers = headers;
            return this;
        }

        public Builder withExceptionId(String exceptionId) {
            model.exceptionId = exceptionId;
            return this;
        }

        public Builder withStatus(Status status) {
            model.status = status;
            return this;
        }

        public Builder withResponseDateTime(Date date) {
            model.responseDateTime = date;
            return this;
        }


        public RequestModel build() {
            return model;
        }


    }

    // ----------------
    // Static method
    // ----------------

    public static Builder builder(String applicationId, String requestId, String groupId) {
        return new Builder(applicationId, requestId, groupId);
    }

    // -----------------------
    // Request Model variables
    // -----------------------

    private String applicationId, requestId, groupId, callerId, path, sessionId, httpMethod,
            clientAddress, hostAddress, headers, exceptionId;

    private Date requestDateTime;

    private Date responseDateTime;

    private Status status;

    public DefaultRequestModel() {
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getCallerId() {
        return callerId;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public Date getRequestDateTime() {
        return requestDateTime;
    }

    public void setRequestDateTime(Date requestDateTime) {
        this.requestDateTime = requestDateTime;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public Date getResponseDateTime() {
        return responseDateTime;
    }

    public void setResponseDateTime(Date responseDateTime) {
        this.responseDateTime = responseDateTime;
    }

    public String getExceptionId() {
        return exceptionId;
    }

    public void setExceptionId(String exceptionId) {
        this.exceptionId = exceptionId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
