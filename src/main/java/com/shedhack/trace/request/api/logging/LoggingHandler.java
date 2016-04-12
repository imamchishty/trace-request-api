package com.shedhack.trace.request.api.logging;

import com.shedhack.trace.request.api.model.RequestModel;

/**
 * Allows developers to use decide how to log the request model.
 * They could simply use SLF4J or log to a database.
 *
 * The log entries should be stored in such a way that they could be easily queried in the future.
 * I would recommend storing all of the Request Model properties.
 * The request-id and the group-id are good candidates for a composite key (if using a relational db).
 * and the application-id would also be an option for an index.
 *
 *
 * @author imamchishty
 */
public interface LoggingHandler {

    /**
     * Does the actually logging.
     */
    void log(RequestModel model);
}
