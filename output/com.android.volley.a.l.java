package com.android.volley.a;

import com.android.volley.n;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;

public final class com.android.volley.a.l implements com.android.volley.a.p
{

    public final HttpClient a;

    l(HttpClient p0) {
        this.a = p0;
    }

    private static void a(HttpEntityEnclosingRequestBase p0, com.android.volley.n p1) {
        v0 = p1.m();
        if (v0 != 0)
            p0.setEntity(new ByteArrayEntity(v0));
    }

    private static void a(HttpUriRequest p0, Map p1) {
        v2 = p1.keySet().iterator();
        while (v2.hasNext()) {
            v0 = (String)v2.next();
            p0.setHeader(v0, (String)p1.get(v0));
        }
    }

    public final HttpResponse b(com.android.volley.n p0, Map p1) {
        switch (p0.b) {
            case -1:
                v1 = p0.j();
                if (v1 != 0) {
                    v0 = new HttpPost(p0.d());
                    v0.addHeader("Content-Type", p0.i());
                    v0.setEntity(new ByteArrayEntity(v1));
                }
                else
                    v0 = new HttpGet(p0.d());
                break;
            case 0:
                v0 = new HttpGet(p0.d());
                break;
            case 1:
                v0 = new HttpPost(p0.d());
                v0.addHeader("Content-Type", p0.l());
                com.android.volley.a.l.a(v0, p0);
                break;
            case 2:
                v0 = new HttpPut(p0.d());
                v0.addHeader("Content-Type", p0.l());
                com.android.volley.a.l.a(v0, p0);
                break;
            case 3:
                v0 = new HttpDelete(p0.d());
                break;
            case 4:
                v0 = new HttpHead(p0.d());
                break;
            case 5:
                v0 = new HttpOptions(p0.d());
                break;
            case 6:
                v0 = new HttpTrace(p0.d());
                break;
            case 7:
                v0 = new com.android.volley.a.m(p0.d());
                v0.addHeader("Content-Type", p0.l());
                com.android.volley.a.l.a(v0, p0);
                break;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
        com.android.volley.a.l.a(v0, p1);
        com.android.volley.a.l.a(v0, p0.h());
        v1 = v0.getParams();
        HttpConnectionParams.setConnectionTimeout(v1, 5000);
        HttpConnectionParams.setSoTimeout(v1, p0.o());
        return this.a.execute(v0);
    }

}
