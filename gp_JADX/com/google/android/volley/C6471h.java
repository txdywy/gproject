package com.google.android.volley;

import com.google.android.f.a;
import com.google.android.f.b;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;

final class C6471h implements ResponseHandler {
    public final ResponseHandler f32463a;
    public final HttpUriRequest f32464b;
    public final a f32465c;

    C6471h(ResponseHandler responseHandler, HttpUriRequest httpUriRequest, a aVar) {
        this.f32463a = responseHandler;
        this.f32464b = httpUriRequest;
        this.f32465c = aVar;
    }

    public final Object handleResponse(HttpResponse httpResponse) {
        return this.f32463a.handleResponse(b.a(this.f32464b, httpResponse, this.f32465c));
    }
}
