package com.shedhack.trace.request.api.interceptor;

import com.shedhack.trace.request.api.model.RequestModel;

/**
 * <pre>
 *     Interceptor allows custom behaviour.
 * </pre>
 *
 * @author imamchishty
 */
public interface TraceRequestInterceptor {

    /**
     * Method invoked when the request has been made.
     * @param request trace request model
     */
    void onEntry(RequestModel request);

    /**
     * Method invoked when the request has been completed.
     * @param request trace request model
     */
    void onExit(RequestModel request);

}
