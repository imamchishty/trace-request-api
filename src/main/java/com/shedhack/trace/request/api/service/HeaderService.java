package com.shedhack.trace.request.api.service;

import java.util.UUID;

/**
 * Header helper class.
 *
 * @author imamchishty
 */
public interface HeaderService {

    default String generateSpanId() {
        return UUID.randomUUID().toString();
    }

    default String generateTraceId() {
        return UUID.randomUUID().toString();
    }

    default String generateCallerId() {
        return UUID.randomUUID().toString();
    }

}
