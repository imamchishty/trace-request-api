package com.shedhack.trace.request.api.model;

import com.shedhack.trace.request.api.constant.Status;

import java.io.Serializable;
import java.util.Date;

/**
 * Data Transfer Object
 */
public class RequestDto implements RequestModel, Serializable {


    // ----------------------------------
    // Static inner class for the builder
    // ----------------------------------

    public static class Builder {

        public Builder(String appId, String reqId, String groupId) {
            withApplicationId(appId).withRequestId(reqId).withGroupId(groupId);
        }

        RequestDto model = new RequestDto();

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


        public RequestDto build() {
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
    // Request DTO variables
    // -----------------------

    private String requestId;
    private String applicationId;
    private String groupId;
    private String callerId;
    private String path;
    private String sessionId;
    private String httpMethod;
    private String clientAddress;
    private String hostAddress;
    private String headers;
    private String exceptionId;
    private Date requestDateTime;
    private Date responseDateTime;
    private Status status;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestDto that = (RequestDto) o;

        if (requestId != null ? !requestId.equals(that.requestId) : that.requestId != null) return false;
        if (applicationId != null ? !applicationId.equals(that.applicationId) : that.applicationId != null)
            return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (callerId != null ? !callerId.equals(that.callerId) : that.callerId != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (sessionId != null ? !sessionId.equals(that.sessionId) : that.sessionId != null) return false;
        if (httpMethod != null ? !httpMethod.equals(that.httpMethod) : that.httpMethod != null) return false;
        if (clientAddress != null ? !clientAddress.equals(that.clientAddress) : that.clientAddress != null)
            return false;
        if (hostAddress != null ? !hostAddress.equals(that.hostAddress) : that.hostAddress != null) return false;
        if (headers != null ? !headers.equals(that.headers) : that.headers != null) return false;
        if (exceptionId != null ? !exceptionId.equals(that.exceptionId) : that.exceptionId != null) return false;
        if (requestDateTime != null ? !requestDateTime.equals(that.requestDateTime) : that.requestDateTime != null)
            return false;
        if (responseDateTime != null ? !responseDateTime.equals(that.responseDateTime) : that.responseDateTime != null)
            return false;
        return status == that.status;

    }

    @Override
    public int hashCode() {
        int result = requestId != null ? requestId.hashCode() : 0;
        result = 31 * result + (applicationId != null ? applicationId.hashCode() : 0);
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (callerId != null ? callerId.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (sessionId != null ? sessionId.hashCode() : 0);
        result = 31 * result + (httpMethod != null ? httpMethod.hashCode() : 0);
        result = 31 * result + (clientAddress != null ? clientAddress.hashCode() : 0);
        result = 31 * result + (hostAddress != null ? hostAddress.hashCode() : 0);
        result = 31 * result + (headers != null ? headers.hashCode() : 0);
        result = 31 * result + (exceptionId != null ? exceptionId.hashCode() : 0);
        result = 31 * result + (requestDateTime != null ? requestDateTime.hashCode() : 0);
        result = 31 * result + (responseDateTime != null ? responseDateTime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RequestDto{" +
                "requestId='" + requestId + '\'' +
                ", applicationId='" + applicationId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", callerId='" + callerId + '\'' +
                ", path='" + path + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", httpMethod='" + httpMethod + '\'' +
                ", clientAddress='" + clientAddress + '\'' +
                ", hostAddress='" + hostAddress + '\'' +
                ", headers='" + headers + '\'' +
                ", exceptionId='" + exceptionId + '\'' +
                ", requestDateTime=" + requestDateTime +
                ", responseDateTime=" + responseDateTime +
                ", status=" + status +
                '}';
    }
}
