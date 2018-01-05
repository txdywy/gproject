package com.android.volley.a;

import com.android.volley.j;
import com.android.volley.n;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;

public final class com.android.volley.a.a extends com.android.volley.a.d
{

    public final com.android.volley.a.p a;

    a(com.android.volley.a.p p0) {
        com.android.volley.a.d();
        this.a = p0;
    }

    public final com.android.volley.a.o a(com.android.volley.n p0, Map p1) {
        try {
            v1 = this.a.b(p0, p1);
        }
        catch (ConnectTimeoutException ex) {
            throw new SocketTimeoutException(ex.getMessage());
        }
        v2 = v1.getStatusLine().getStatusCode();
        v3 = v1.getAllHeaders();
        v4 = new ArrayList(v3.length);
        v0 = 0;
        while (v0 < v3.length) {
            v4.add(new com.android.volley.j(v3[v0].getName(), v3[v0].getValue()));
            v0 = v0 + 1;
        }
        if (v1.getEntity() == 0)
            v0 = new com.android.volley.a.o(v2, v4);
        else {
            v6 = v1.getEntity().getContentLength();
            if ((long)(int)v6 != v6)
                throw new IOException(40 + "Response too large: " + v6);
            v0 = new com.android.volley.a.o(v2, v4, (int)v1.getEntity().getContentLength(), v1.getEntity().getContent());
        }
        return v0;
    }

}
