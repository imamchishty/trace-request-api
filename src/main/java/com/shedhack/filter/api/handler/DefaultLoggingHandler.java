package com.shedhack.filter.api.handler;

import com.shedhack.filter.api.model.RequestModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Default implementation which uses SLF4J api to
 * setup the MDC (in the setup method), to log at INFO level (via the log method)
 * and finally to clear the MDC (in the cleanup method).
 *
 * @author imamchishty
 */
public class DefaultLoggingHandler implements LoggingHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultLoggingHandler.class);

    /**
     * Logs the {@link RequestModel}
     *
     * The MDC will already contain the request-id, group-id, so it isn't worth
     * logging those (you'd get them twice in the log entry).
     */
    public void log(RequestModel model) {
        if(model != null) {
            LOGGER.info("{" +
                    "path='" + model.getPath() + '\'' +
                    ", callerId='" + model.getCallerId() + '\'' +
                    ", sessionId='" + model.getSessionId() + '\'' +
                    ", clientAddress='" + model.getClientAddress() + '\'' +
                    ", hostAddress='" + model.getHostAddress() + '\'' +
                    ", httpMethod='" + model.getHttpMethod() + '\'' +
                    '}');
        }
    }


}
