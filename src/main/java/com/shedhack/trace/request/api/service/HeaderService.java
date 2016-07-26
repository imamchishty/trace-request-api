package com.shedhack.trace.request.api.service;

import java.util.UUID;

/**
 * Header helper class.
 *
 * @author imamchishty
 */
public interface HeaderService {

    default String generateRequestId() {
        return UUID.randomUUID().toString();
    }

    default String generateGroupId() {
        return UUID.randomUUID().toString();
    }

    default String generateCallerId() {
        return UUID.randomUUID().toString();
    }

}
