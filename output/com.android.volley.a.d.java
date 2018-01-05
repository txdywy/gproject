package com.android.volley.a;

import com.android.volley.j;
import com.android.volley.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public final class com.android.volley.a.d implements com.android.volley.a.p
{

    d() {
    }

    public abstract com.android.volley.a.o a(com.android.volley.n p0, Map p1);

    public final HttpResponse b(com.android.volley.n p0, Map p1) {
        v1 = this.a(p0, p1);
        v3 = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), v1.a, ""));
        v2 = new ArrayList();
        v4 = Collections.unmodifiableList(v1.b).iterator();
        while (v4.hasNext()) {
            v0 = (com.android.volley.j)v4.next();
            v2.add(new BasicHeader(v0.a, v0.b));
        }
        v3.setHeaders((Header[])v2.toArray(new Header[v2.size()]));
        if (v1.d != 0) {
            v2 = new BasicHttpEntity();
            v2.setContent(v1.d);
            v2.setContentLength((long)v1.c);
            v3.setEntity(v2);
        }
        return v3;
    }

}
