package com.shedhack.filter.api.model;

import java.util.Date;

/**
 * <pre>
 *  Request model containing the following properties:
 *
 *  applicationId, requestId, groupId, callerId, path, sessionId, httpMethod,
 *  clientAddress, hostAddress, dateTime, count.
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

        DefaultRequestModel model = new DefaultRequestModel();

        public Builder withApplicationId(String id) {
            model.applicationId = id;
            return this;
        }

        public Builder withDateTime(Date date){
            model.dateTime = date;
            return this;
        }

        public Builder withRequestId(String requestId) {
            model.requestId = requestId;
            return this;
        }

        public Builder withGroupId(String groupId) {
            model.groupId = groupId;
            return this;
        }

        public Builder withCallerId(String callerId) {
            model.callerId = callerId;
            return this;
        }

        public Builder withCount(int count) {
            model.count = count;
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

        public RequestModel build() {
            return model;
        }
    }

    // ----------------
    // Static method
    // ----------------

    public static Builder builder() {
        return new Builder();
    }

    // -----------------------
    // Request Model variables
    // -----------------------

    private String applicationId, requestId, groupId, callerId, path, sessionId, httpMethod,
            clientAddress, hostAddress;

    private Date dateTime;

    private int count;

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

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DefaultRequestModel that = (DefaultRequestModel) o;

        if (count != that.count) return false;
        if (applicationId != null ? !applicationId.equals(that.applicationId) : that.applicationId != null)
            return false;
        if (requestId != null ? !requestId.equals(that.requestId) : that.requestId != null) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (callerId != null ? !callerId.equals(that.callerId) : that.callerId != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (sessionId != null ? !sessionId.equals(that.sessionId) : that.sessionId != null) return false;
        if (httpMethod != null ? !httpMethod.equals(that.httpMethod) : that.httpMethod != null) return false;
        if (clientAddress != null ? !clientAddress.equals(that.clientAddress) : that.clientAddress != null)
            return false;
        if (hostAddress != null ? !hostAddress.equals(that.hostAddress) : that.hostAddress != null) return false;
        return dateTime != null ? dateTime.equals(that.dateTime) : that.dateTime == null;

    }

    @Override
    public int hashCode() {
        int result = applicationId != null ? applicationId.hashCode() : 0;
        result = 31 * result + (requestId != null ? requestId.hashCode() : 0);
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (callerId != null ? callerId.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (sessionId != null ? sessionId.hashCode() : 0);
        result = 31 * result + (httpMethod != null ? httpMethod.hashCode() : 0);
        result = 31 * result + (clientAddress != null ? clientAddress.hashCode() : 0);
        result = 31 * result + (hostAddress != null ? hostAddress.hashCode() : 0);
        result = 31 * result + (dateTime != null ? dateTime.hashCode() : 0);
        result = 31 * result + count;
        return result;
    }

    public String toString() {
        return "DefaultRequestModel{" +
                "applicationId='" + applicationId + '\'' +
                ", requestId='" + requestId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", callerId='" + callerId + '\'' +
                ", path='" + path + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", httpMethod='" + httpMethod + '\'' +
                ", clientAddress='" + clientAddress + '\'' +
                ", hostAddress='" + hostAddress + '\'' +
                ", dateTime=" + dateTime +
                ", count=" + count +
                '}';
    }
}
