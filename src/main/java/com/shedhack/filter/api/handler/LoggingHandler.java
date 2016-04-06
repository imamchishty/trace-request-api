package com.shedhack.filter.api.handler;

import com.shedhack.filter.api.model.RequestModel;

/**
 * Allows developers to use decide how to log the request model.
 * They could simply use SLF4J or log to a database.
 *
 * @author imamchishty
 */
public interface LoggingHandler {

    /**
     * Does the actually logging.
     */
    void log(RequestModel model);
}
