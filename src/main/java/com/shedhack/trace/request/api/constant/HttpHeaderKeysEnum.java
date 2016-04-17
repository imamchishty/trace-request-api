package com.shedhack.trace.request.api.constant;

/**
 * HTTP header keys.
 *
 * @author imamchishty
 */
public enum HttpHeaderKeysEnum {

    REQUEST_ID("request-id"),
    GROUP_ID("group-id"),
    CALLER_ID("caller-id"),
    HOST("host"),
    APPLICATION_ID("application-id"),
    CALLER_IP("X-Forwarded-For"),
    EXCEPTION_ID("Exception-Id"),
    EXCEPTION_TYPE("Exception-Type");

    private final String key;

    HttpHeaderKeysEnum(String key) {
        this.key = key;
    }

    public String key() {
        return key;
    }
}
