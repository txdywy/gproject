package com.android.volley.p060a;

import com.android.volley.C0656n;
import com.android.volley.C0695j;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

final class C0655a extends C0654d {
    public final C0653p f4025a;

    C0655a(C0653p c0653p) {
        this.f4025a = c0653p;
    }

    public final C0674o mo1054a(C0656n c0656n, Map map) {
        try {
            HttpResponse b = this.f4025a.mo1053b(c0656n, map);
            int statusCode = b.getStatusLine().getStatusCode();
            Header[] allHeaders = b.getAllHeaders();
            List arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new C0695j(header.getName(), header.getValue()));
            }
            if (b.getEntity() == null) {
                return new C0674o(statusCode, arrayList);
            }
            long contentLength = b.getEntity().getContentLength();
            if (((long) ((int) contentLength)) == contentLength) {
                return new C0674o(statusCode, arrayList, (int) b.getEntity().getContentLength(), b.getEntity().getContent());
            }
            throw new IOException("Response too large: " + contentLength);
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
