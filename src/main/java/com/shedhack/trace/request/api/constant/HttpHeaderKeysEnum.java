package com.shedhack.trace.request.api.constant;

/**
 * HTTP header keys.
 *
 * @author imamchishty
 */
public enum HttpHeaderKeysEnum {

    REQUEST_ID("requestId"),
    GROUP_ID("groupId"),
    CALLER_ID("callerId"),
    HOST("host"),
    APPLICATION_ID("applicationId"),
    CALLER_IP("X-Forwarded-For"),
    EXCEPTION_ID("exceptionId"),
    EXCEPTION_TYPE("exceptionType"),
    REQUEST_STATUS("requestStatus"),
    REQUEST_PATH("requestPath");

    private final String key;

    HttpHeaderKeysEnum(String key) {
        this.key = key;
    }

    public String key() {
        return key;
    }
}
