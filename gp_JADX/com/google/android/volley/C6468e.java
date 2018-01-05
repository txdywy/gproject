package com.google.android.volley;

import android.util.Log;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

final class C6468e implements HttpRequestInterceptor {
    public final /* synthetic */ C6464a f32458a;

    C6468e(C6464a c6464a) {
        this.f32458a = c6464a;
    }

    public final void process(HttpRequest httpRequest, HttpContext httpContext) {
        C6469f c6469f = this.f32458a.f32455e;
        if (c6469f != null && Log.isLoggable(c6469f.f32459a, c6469f.f32460b) && (httpRequest instanceof HttpUriRequest)) {
            Log.println(c6469f.f32460b, c6469f.f32459a, C6464a.m29521a((HttpUriRequest) httpRequest));
        }
    }
}
