package com.shedhack.trace.request.api.threadlocal;

import com.shedhack.trace.request.api.model.RequestDto;
import com.shedhack.trace.request.api.model.RequestModel;
import org.junit.Test;

import java.util.Date;

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
        String headers = "{\"host\":\"localhost:8080\",\"connection\":\"keep-alive\",\"cache-control\":\"max-age=0\",\"accept\":\"text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8\",\"upgrade-insecure-requests\":\"1\",\"user-agent\":\"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.110 Safari/537.36\",\"dnt\":\"1\",\"accept-encoding\":\"gzip, deflate, sdch\",\"accept-language\":\"en-US,en;q=0.8\"}";
        int statusCode = 400;
        // Act
        RequestDto.Builder builder = RequestDto.builder(appId, reqId, grpId);
        builder.withRequestDateTime(new Date()).withCallerId(calId).withClientAddress(IPadd)
                .withHostAddress(IPadd).withHttpHeaders(headers).withPath(path).withSessionId(sesId)
                .withHttpStatusCode(statusCode);

        return builder.build();
    }
}
