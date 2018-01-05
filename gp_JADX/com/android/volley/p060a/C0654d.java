package com.android.volley.p060a;

import com.android.volley.C0656n;
import com.android.volley.C0695j;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public abstract class C0654d implements C0653p {
    public abstract C0674o mo1054a(C0656n c0656n, Map map);

    @Deprecated
    public final HttpResponse mo1053b(C0656n c0656n, Map map) {
        C0674o a = mo1054a(c0656n, map);
        HttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), a.f4091a, ""));
        List arrayList = new ArrayList();
        for (C0695j c0695j : Collections.unmodifiableList(a.f4092b)) {
            arrayList.add(new BasicHeader(c0695j.f4159a, c0695j.f4160b));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream inputStream = a.f4094d;
        if (inputStream != null) {
            HttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(inputStream);
            basicHttpEntity.setContentLength((long) a.f4093c);
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }
}
