package com.google.android.finsky.billing.addresschallenge.a;

import android.os.Process;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

public final class com.google.android.finsky.billing.addresschallenge.a.ak extends Thread
{

    public static final HttpClient a;
    public HttpUriRequest b;
    public com.google.android.finsky.billing.addresschallenge.a.aj c;

    static {
        com.google.android.finsky.billing.addresschallenge.a.ak.a = new DefaultHttpClient();
    }

    ak(HttpUriRequest p0, com.google.android.finsky.billing.addresschallenge.a.aj p1) {
        Thread();
        this.b = p0;
        this.c = p1;
    }

    public final void run() {
        Process.setThreadPriority(10);
        try {
            enter com.google.android.finsky.billing.addresschallenge.a.ak.a;
        }
        catch (Exception ex) {
            this.c.a();
            return;
        }
        try {
            exit com.google.android.finsky.billing.addresschallenge.a.ak.a;
        }
        catch (Throwable ex) {
            try {
                exit com.google.android.finsky.billing.addresschallenge.a.ak.a;
            }
            catch (Throwable ex) {
                exit com.google.android.finsky.billing.addresschallenge.a.ak.a;
                throw ex;
            }
            throw ex;
        }
        try {
            this.c.a(com.google.android.finsky.billing.addresschallenge.a.ah.a((String)com.google.android.finsky.billing.addresschallenge.a.ak.a.execute(this.b, new BasicResponseHandler())));
        }
        catch (Exception ex) {
            this.c.a();
        }
        return;
        try {
            exit com.google.android.finsky.billing.addresschallenge.a.ak.a;
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.billing.addresschallenge.a.ak.a;
            throw ex;
        }
        try {
            throw ex;
        }
        catch (Exception ex) {
            this.c.a();
            return;
        }
    }

}
