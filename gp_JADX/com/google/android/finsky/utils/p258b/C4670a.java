package com.google.android.finsky.utils.p258b;

import android.content.Context;
import android.support.v4.p037h.C0305a;
import com.android.volley.AuthFailureError;
import com.android.volley.C0656n;
import com.android.volley.p060a.C0653p;
import com.google.android.finsky.api.C1286g;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.volley.ok.UrlRewriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.chromium.net.e;
import org.chromium.net.f;

public final class C4670a implements C0653p {
    public final e f24049a;
    public final UrlRewriter f24050b;
    public final boolean f24051c;
    public final boolean f24052d;

    public C4670a(Context context, UrlRewriter urlRewriter, boolean z, boolean z2) {
        f fVar = new f(context);
        this.f24052d = z;
        if (this.f24052d) {
            fVar.a(true).a(C1286g.f7656a.getHost(), 443, 443);
        }
        this.f24051c = z2;
        fVar.b(this.f24051c);
        this.f24049a = fVar.a();
        this.f24050b = urlRewriter;
    }

    public final HttpResponse mo1053b(C0656n c0656n, Map map) {
        String d = this.f24050b == null ? c0656n.mo1545d() : this.f24050b.mo5391a(c0656n.mo1545d());
        if (d == null) {
            String str = "URL blocked by rewriter: ";
            d = String.valueOf(c0656n.mo1545d());
            throw new IOException(d.length() != 0 ? str.concat(d) : new String(str));
        }
        ProtocolVersion protocolVersion;
        Map c0305a = new C0305a();
        c0305a.putAll(c0656n.mo1547h());
        c0305a.putAll(map);
        HttpURLConnection a = m21779a(new URL(d), c0656n);
        for (String d2 : c0305a.keySet()) {
            a.addRequestProperty(d2, (String) c0305a.get(d2));
        }
        switch (c0656n.f4027b) {
            case -1:
                byte[] j = c0656n.mo1059j();
                if (j != null) {
                    a.setRequestMethod("POST");
                    C4670a.m21782a(a, c0656n.mo1058i(), j);
                    break;
                }
                break;
            case 0:
                a.setRequestMethod("GET");
                break;
            case 1:
                a.setRequestMethod("POST");
                C4670a.m21781a(a, c0656n);
                break;
            case 2:
                a.setRequestMethod("PUT");
                C4670a.m21781a(a, c0656n);
                break;
            case 3:
                a.setRequestMethod("DELETE");
                break;
            default:
                throw new IllegalStateException("Unsupported HTTP method: " + c0656n.f4027b);
        }
        if (this.f24051c || this.f24052d) {
            protocolVersion = new ProtocolVersion("HTTP", 2, 0);
        } else {
            protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        }
        if (a.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        StatusLine basicStatusLine = new BasicStatusLine(protocolVersion, a.getResponseCode(), a.getResponseMessage());
        HttpResponse basicHttpResponse = new BasicHttpResponse(basicStatusLine);
        int i = c0656n.f4027b;
        int statusCode = basicStatusLine.getStatusCode();
        i = (i == 4 || ((100 <= statusCode && statusCode < 200) || statusCode == 204 || statusCode == 304 || statusCode == 302)) ? 0 : 1;
        if (i != 0) {
            basicHttpResponse.setEntity(C4670a.m21780a(a));
        }
        for (Entry entry : a.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                basicHttpResponse.addHeader(new BasicHeader((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return basicHttpResponse;
    }

    private static HttpEntity m21780a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        HttpEntity basicHttpEntity = new BasicHttpEntity();
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (IOException e) {
            inputStream = httpURLConnection.getErrorStream();
        }
        basicHttpEntity.setContent(inputStream);
        basicHttpEntity.setContentLength((long) httpURLConnection.getContentLength());
        basicHttpEntity.setContentEncoding(httpURLConnection.getContentEncoding());
        basicHttpEntity.setContentType(httpURLConnection.getContentType());
        return basicHttpEntity;
    }

    private final HttpURLConnection m21779a(URL url, C0656n c0656n) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f24049a.a(url);
        httpURLConnection.setReadTimeout(c0656n.m4382o());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        try {
            byte[] m = c0656n.mo1061m();
            if (m != null) {
                httpURLConnection.setFixedLengthStreamingMode(m.length);
            }
        } catch (AuthFailureError e) {
            FinskyLog.m21662b("AuthFailureError retrieving request body, unable to set fixed length streaming mode: %s", e);
        }
        return httpURLConnection;
    }

    private static void m21781a(HttpURLConnection httpURLConnection, C0656n c0656n) {
        byte[] m = c0656n.mo1061m();
        if (m != null) {
            C4670a.m21782a(httpURLConnection, c0656n.mo1060l(), m);
        }
    }

    private static void m21782a(HttpURLConnection httpURLConnection, String str, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        httpURLConnection.addRequestProperty("Content-Type", str);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }
}
