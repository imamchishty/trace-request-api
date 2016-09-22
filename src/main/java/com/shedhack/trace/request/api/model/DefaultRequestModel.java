package com.shedhack.trace.request.api.model;

import com.shedhack.trace.request.api.constant.Status;

import java.io.Serializable;

/**
 * Data Transfer Object
 */
public class DefaultRequestModel implements RequestModel, Serializable {

    // ----------------------------------
    // Static inner class for the builder
    // ----------------------------------

    public static class Builder {

        public Builder(String appId, String spanId, String traceId) {
            withApplicationId(appId).withSpanId(spanId).withTraceId(traceId);
        }

        DefaultRequestModel model = new DefaultRequestModel();

        private Builder withApplicationId(String id) {
            model.applicationId = id;
            return this;
        }

        public Builder withRequestDateTime(long date){
            model.requestDateTime = date;
            return this;
        }

        private Builder withSpanId(String spanId) {
            model.spanId = spanId;
            return this;
        }

        private Builder withTraceId(String traceId) {
            model.traceId = traceId;
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

        public Builder withResponseDateTime(long date) {
            model.responseDateTime = date;
            return this;
        }

        public Builder withHttpStatusCode(int code) {
            model.httpStatusCode = code;
            return this;
        }

        public DefaultRequestModel build() {
            return model;
        }


    }

    // ----------------
    // Static method
    // ----------------

    public static Builder builder(String applicationId, String spanId, String traceId) {
        return new Builder(applicationId, spanId, traceId);
    }

    // -----------------------
    // Request DTO variables
    // -----------------------

    private String spanId;
    private String applicationId;
    private String traceId;
    private String callerId;
    private String path;
    private String sessionId;
    private String httpMethod;
    private String clientAddress;
    private String hostAddress;
    private String headers;
    private String exceptionId;
    private long requestDateTime;
    private long responseDateTime;
    private Status status;
    private int httpStatusCode;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
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

    public long getRequestDateTime() {
        return requestDateTime;
    }

    public void setRequestDateTime(long requestDateTime) {
        this.requestDateTime = requestDateTime;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public long getResponseDateTime() {
        return responseDateTime;
    }

    public void setResponseDateTime(long responseDateTime) {
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

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DefaultRequestModel that = (DefaultRequestModel) o;

        if (requestDateTime != that.requestDateTime) return false;
        if (responseDateTime != that.responseDateTime) return false;
        if (httpStatusCode != that.httpStatusCode) return false;
        if (spanId != null ? !spanId.equals(that.spanId) : that.spanId != null) return false;
        if (applicationId != null ? !applicationId.equals(that.applicationId) : that.applicationId != null)
            return false;
        if (traceId != null ? !traceId.equals(that.traceId) : that.traceId != null) return false;
        if (callerId != null ? !callerId.equals(that.callerId) : that.callerId != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (sessionId != null ? !sessionId.equals(that.sessionId) : that.sessionId != null) return false;
        if (httpMethod != null ? !httpMethod.equals(that.httpMethod) : that.httpMethod != null) return false;
        if (clientAddress != null ? !clientAddress.equals(that.clientAddress) : that.clientAddress != null)
            return false;
        if (hostAddress != null ? !hostAddress.equals(that.hostAddress) : that.hostAddress != null) return false;
        if (headers != null ? !headers.equals(that.headers) : that.headers != null) return false;
        if (exceptionId != null ? !exceptionId.equals(that.exceptionId) : that.exceptionId != null) return false;
        return status == that.status;

    }

    @Override
    public int hashCode() {
        int result = spanId != null ? spanId.hashCode() : 0;
        result = 31 * result + (applicationId != null ? applicationId.hashCode() : 0);
        result = 31 * result + (traceId != null ? traceId.hashCode() : 0);
        result = 31 * result + (callerId != null ? callerId.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (sessionId != null ? sessionId.hashCode() : 0);
        result = 31 * result + (httpMethod != null ? httpMethod.hashCode() : 0);
        result = 31 * result + (clientAddress != null ? clientAddress.hashCode() : 0);
        result = 31 * result + (hostAddress != null ? hostAddress.hashCode() : 0);
        result = 31 * result + (headers != null ? headers.hashCode() : 0);
        result = 31 * result + (exceptionId != null ? exceptionId.hashCode() : 0);
        result = 31 * result + (int) (requestDateTime ^ (requestDateTime >>> 32));
        result = 31 * result + (int) (responseDateTime ^ (responseDateTime >>> 32));
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + httpStatusCode;
        return result;
    }

    @Override
    public String toString() {
        return "{\"DefaultRequestModel\":{"
                + "\"spanId\":\"" + spanId + "\""
                + ", \"applicationId\":\"" + applicationId + "\""
                + ", \"traceId\":\"" + traceId + "\""
                + ", \"callerId\":\"" + callerId + "\""
                + ", \"path\":\"" + path + "\""
                + ", \"sessionId\":\"" + sessionId + "\""
                + ", \"httpMethod\":\"" + httpMethod + "\""
                + ", \"clientAddress\":\"" + clientAddress + "\""
                + ", \"hostAddress\":\"" + hostAddress + "\""
                + ", \"headers\":\"" + headers + "\""
                + ", \"exceptionId\":\"" + exceptionId + "\""
                + ", \"requestDateTime\":\"" + requestDateTime + "\""
                + ", \"responseDateTime\":\"" + responseDateTime + "\""
                + ", \"status\":\"" + status + "\""
                + ", \"httpStatusCode\":\"" + httpStatusCode + "\""
                + "}}";
    }
}
