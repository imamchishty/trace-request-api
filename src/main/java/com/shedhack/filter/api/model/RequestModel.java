package com.shedhack.filter.api.model;

/**
 * Interface for the RequestModel.
 *
 * @author imamchishty
 */
public interface RequestModel {

    String getRequestId();

    String getGroupId();

    String getCallerId();

    String getPath();

    String getSessionId();

    String getHttpMethod();

    String getClientAddress();

    String getHostAddress();
}
