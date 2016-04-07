package com.shedhack.trace.request.api.constant;

/**
 * HTTP header keys.
 *
 * @author imamchishty
 */
public enum HttpHeaderKeysEnum {

    REQUEST_ID("request-id"),
    GROUP_ID("chain-id"),
    CALLER_ID("caller-id"),
    HOST("host"),
    CHAIN_COUNT("chain-count"),
    APPLICATION_ID("application-id");

    private final String key;

    HttpHeaderKeysEnum(String key) {
        this.key = key;
    }

    public String key() {
        return key;
    }
}
