package com.shedhack.trace.request.api.threadlocal;

import com.shedhack.trace.request.api.model.DefaultRequestModel;
import com.shedhack.trace.request.api.model.RequestModel;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;

/**
 * Test for {@link RequestThreadLocalHelper}
 *
 * @author imamchishty
 */
public class RequestThreadLocalHelperTest {

    @Test
    public void should_create_thread_local() {

        // get model
        RequestModel model = makeModel();

        // Save to threadlocal
        RequestThreadLocalHelper.set(model);

        // Assert
        assertEquals(model, RequestThreadLocalHelper.get());

    }

    @Test
    public void should_clear_thread_local() {

        // get model
        RequestModel model = makeModel();

        // Save to threadlocal
        RequestThreadLocalHelper.set(model);
        assertEquals(model, RequestThreadLocalHelper.get());

        // Clear
        RequestThreadLocalHelper.clear();
        assertNull(RequestThreadLocalHelper.get());
    }

    public static RequestModel makeModel() {

        String appId = "appId";
        String reqId = "reqId";
        String grpId = "grpId";
        String calId = "calId";
        String IPadd = "1.2.3.4";
        String path  = "/a/b/c";
        String sesId = "ABCDEF";

        Map<String, String> headers = new HashMap<>();
        headers.put("host", "localhost:808");
        headers.put("connection","keep-alive");
        headers.put("cache-control","max-age=0");
        headers.put("accept","text/html,application/xhtml+xml");
        headers.put("user-agent","Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5)");
        headers.put("accept-language","en-US");

        int statusCode = 400;
        // Act
        DefaultRequestModel.Builder builder = DefaultRequestModel.builder(appId, reqId, grpId);
        builder.withRequestDateTime(new Date().getTime()).withCallerId(calId).withClientAddress(IPadd)
                .withHostAddress(IPadd).withHttpHeaders(headers).withPath(path).withSessionId(sesId)
                .withHttpStatusCode(statusCode);

        return builder.build();
    }
}
