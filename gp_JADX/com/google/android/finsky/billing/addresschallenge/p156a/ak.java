package com.google.android.finsky.billing.addresschallenge.p156a;

import android.os.Process;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

final class ak extends Thread {
    public static final HttpClient f8828a = new DefaultHttpClient();
    public HttpUriRequest f8829b;
    public aj f8830c;

    protected ak(HttpUriRequest httpUriRequest, aj ajVar) {
        this.f8829b = httpUriRequest;
        this.f8830c = ajVar;
    }

    public final void run() {
        Process.setThreadPriority(10);
        try {
            String str;
            synchronized (f8828a) {
                str = (String) f8828a.execute(this.f8829b, new BasicResponseHandler());
            }
            this.f8830c.mo2420a(ah.m9541a(str));
        } catch (Exception e) {
            this.f8830c.mo2419a();
        }
    }
}
