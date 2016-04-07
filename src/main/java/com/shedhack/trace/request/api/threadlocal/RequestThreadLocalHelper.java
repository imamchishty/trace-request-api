package com.shedhack.trace.request.api.threadlocal;


import com.shedhack.trace.request.api.model.RequestModel;

/**
 * ThreadLocal wrapper for {@ RequestModel}
 *
 * @author imamchishty
 */
public class RequestThreadLocalHelper {

    private static final ThreadLocal<RequestModel> local = new ThreadLocal<>();

    public static void set(RequestModel model) {
        local.set(model);
    }

    public static RequestModel get() {
        return local.get();
    }

    public static void clear(){
        local.remove();
    }

}