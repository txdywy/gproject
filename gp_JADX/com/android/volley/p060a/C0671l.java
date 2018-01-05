package com.android.volley.p060a;

import com.android.volley.C0656n;
import java.util.Map;
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
import org.apache.http.params.HttpParams;

@Deprecated
public class C0671l implements C0653p {
    public final HttpClient f4090a;

    public C0671l(HttpClient httpClient) {
        this.f4090a = httpClient;
    }

    private static void m4457a(HttpUriRequest httpUriRequest, Map map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, (String) map.get(str));
        }
    }

    public final HttpResponse mo1053b(C0656n c0656n, Map map) {
        HttpUriRequest httpGet;
        HttpEntityEnclosingRequestBase httpPost;
        switch (c0656n.f4027b) {
            case -1:
                byte[] j = c0656n.mo1059j();
                if (j == null) {
                    httpGet = new HttpGet(c0656n.mo1545d());
                    break;
                }
                httpGet = new HttpPost(c0656n.mo1545d());
                httpGet.addHeader("Content-Type", c0656n.mo1058i());
                httpGet.setEntity(new ByteArrayEntity(j));
                break;
            case 0:
                httpGet = new HttpGet(c0656n.mo1545d());
                break;
            case 1:
                httpPost = new HttpPost(c0656n.mo1545d());
                httpPost.addHeader("Content-Type", c0656n.mo1060l());
                C0671l.m4456a(httpPost, c0656n);
                break;
            case 2:
                httpPost = new HttpPut(c0656n.mo1545d());
                httpPost.addHeader("Content-Type", c0656n.mo1060l());
                C0671l.m4456a(httpPost, c0656n);
                break;
            case 3:
                httpGet = new HttpDelete(c0656n.mo1545d());
                break;
            case 4:
                httpGet = new HttpHead(c0656n.mo1545d());
                break;
            case 5:
                httpGet = new HttpOptions(c0656n.mo1545d());
                break;
            case 6:
                httpGet = new HttpTrace(c0656n.mo1545d());
                break;
            case 7:
                httpPost = new C0672m(c0656n.mo1545d());
                httpPost.addHeader("Content-Type", c0656n.mo1060l());
                C0671l.m4456a(httpPost, c0656n);
                break;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
        C0671l.m4457a(httpGet, map);
        C0671l.m4457a(httpGet, c0656n.mo1547h());
        HttpParams params = httpGet.getParams();
        int o = c0656n.m4382o();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, o);
        return this.f4090a.execute(httpGet);
    }

    private static void m4456a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, C0656n c0656n) {
        byte[] m = c0656n.mo1061m();
        if (m != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(m));
        }
    }
}
