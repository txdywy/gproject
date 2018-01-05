package com.android.volley.p060a;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class C0672m extends HttpEntityEnclosingRequestBase {
    public C0672m(String str) {
        setURI(URI.create(str));
    }

    public final String getMethod() {
        return "PATCH";
    }
}
