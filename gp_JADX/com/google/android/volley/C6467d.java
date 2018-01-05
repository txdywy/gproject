package com.google.android.volley;

import java.io.IOException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

final class C6467d implements HttpRequestRetryHandler {
    C6467d() {
    }

    public final boolean retryRequest(IOException iOException, int i, HttpContext httpContext) {
        return false;
    }
}
