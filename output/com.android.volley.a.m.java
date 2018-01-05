package com.android.volley.a;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class com.android.volley.a.m extends HttpEntityEnclosingRequestBase
{

    m() {
        HttpEntityEnclosingRequestBase();
    }

    m(String p0) {
        HttpEntityEnclosingRequestBase();
        this.setURI(URI.create(p0));
    }

    public final String getMethod() {
        return "PATCH";
    }

}
