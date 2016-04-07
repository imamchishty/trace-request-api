package com.shedhack.trace.request.api.model;

import java.util.Date;

/**
 * Interface for the RequestModel.
 *
 * @author imamchishty
 */
public interface RequestModel {

    String getApplicationId();

    String getRequestId();

    String getGroupId();

    String getCallerId();

    int getCount();

    String getPath();

    String getSessionId();

    String getHttpMethod();

    String getClientAddress();

    String getHostAddress();

    Date getDateTime();
}
